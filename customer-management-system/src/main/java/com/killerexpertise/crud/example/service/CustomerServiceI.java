package com.killerexpertise.crud.example.service;


import com.killerexpertise.crud.example.model.Customer;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

public interface CustomerServiceI {
    Customer saveCustomer(Customer customer, MultipartFile file) throws IOException;

    List<Customer> getAll();

    Customer getById(Long id);

    Customer updateCustomer(Long id, Customer customer, MultipartFile file) throws IOException;

    boolean deleteCustomer(Long id);
}
