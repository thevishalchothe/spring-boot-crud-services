package com.killerexpertise.crud.example.service.impl;

import com.killerexpertise.crud.example.model.Customer;
import com.killerexpertise.crud.example.repository.CustomerRepository;
import com.killerexpertise.crud.example.service.CustomerServiceI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerServiceI {

    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public Customer saveCustomer(Customer customer, MultipartFile file) throws IOException {
        if (file != null && !file.isEmpty()) {
            customer.setAadharCard(file.getBytes());
        }
        return customerRepository.save(customer);
    }

    @Override
    public List<Customer> getAll() {
        return customerRepository.findAll();
    }

    @Override
    public Customer getById(Long id) {
        return customerRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Customer with ID " + id + " not found"));
    }

    @Override
    public Customer updateCustomer(Long id, Customer updatedCustomer, MultipartFile file) throws IOException {
        Customer existing = getById(id); // throws RuntimeException if not found
        existing.setName(updatedCustomer.getName());
        existing.setEmail(updatedCustomer.getEmail());
        existing.setMobile(updatedCustomer.getMobile());
        existing.setAddress(updatedCustomer.getAddress());

        if (file != null && !file.isEmpty()) {
            existing.setAadharCard(file.getBytes());
        }

        return customerRepository.save(existing);
    }

    @Override
    public boolean deleteCustomer(Long id) {
        Customer existing = getById(id); // throws RuntimeException if not found
        customerRepository.delete(existing);
        return true;
    }
}
