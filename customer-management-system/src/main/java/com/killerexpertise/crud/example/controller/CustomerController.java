package com.killerexpertise.crud.example.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.killerexpertise.crud.example.model.Customer;
import com.killerexpertise.crud.example.service.CustomerServiceI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/api/customers")
public class CustomerController {

    @Autowired
    private CustomerServiceI customerServiceI;

    @PostMapping(consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    public ResponseEntity<Customer> createCustomer(
            @RequestParam("customer") String customerJson,
            @RequestParam("file") MultipartFile file) throws IOException {

        ObjectMapper mapper = new ObjectMapper();
        Customer customer = mapper.readValue(customerJson, Customer.class);
        Customer saved = customerServiceI.saveCustomer(customer, file);

        return ResponseEntity.status(HttpStatus.CREATED).body(saved);
    }

    @GetMapping("/get-all")
    public ResponseEntity<List<Customer>> getAll() {
        List<Customer> customers = customerServiceI.getAll();
        return ResponseEntity.ok(customers);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Customer> getById(@PathVariable Long id) {
        Customer customer = customerServiceI.getById(id);
        return ResponseEntity.ok(customer);
    }

    @PutMapping(value = "/{id}", consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    public ResponseEntity<Customer> updateCustomer(
            @PathVariable Long id,
            @RequestParam("customer") String customerJson,
            @RequestParam(value = "file", required = false) MultipartFile file) throws IOException {

        ObjectMapper mapper = new ObjectMapper();
        Customer customer = mapper.readValue(customerJson, Customer.class);
        Customer updated = customerServiceI.updateCustomer(id, customer, file);
        return ResponseEntity.ok(updated);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        customerServiceI.deleteCustomer(id);
        return ResponseEntity.ok().build();
    }
}
