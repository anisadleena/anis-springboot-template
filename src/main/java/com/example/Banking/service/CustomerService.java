package com.example.Banking.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Banking.model.Customer;
import com.example.Banking.repository.CustomerRepository;

import java.util.List;
import java.util.UUID;

@Service
public class CustomerService {
    @Autowired
    CustomerRepository customerRepository;

    public List<Customer> getAllCustomers(){
        List<Customer> customerLists = null;
        customerLists = customerRepository.findAll();
        System.out.println("customerLists : " + customerLists);

        return customerLists;
    }

    public String signup(Customer customer) {
        if (customerRepository.findByEmail(customer.getEmail()).isPresent()) {
            return "Email already in use";
        }
         // Set UUID
        customer.setId(UUID.randomUUID().toString());
        customerRepository.save(customer); 
        return "customer registered successfully";
    }
}
