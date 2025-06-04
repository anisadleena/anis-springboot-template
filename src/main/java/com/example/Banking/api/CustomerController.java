package com.example.Banking.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.Banking.model.Customer;
import com.example.Banking.service.CustomerService;

import java.util.List;

@RequestMapping("api/v1/bank/customer")
@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class CustomerController {
    @Autowired
    CustomerService customerService;

    @GetMapping("/get/All")
    public ResponseEntity<List<Customer>> getAllCustomers(){
        List<Customer> customer = customerService.getAllCustomers();
        return ResponseEntity.ok(customer);
    }

    @PostMapping("/signup")
    public ResponseEntity<String> signup(@RequestBody Customer customer) {
        String result = customerService.signup(customer);
        return ResponseEntity.ok(result);
    }

    // @PostMapping("/login")
    // public ResponseEntity<String> login(@RequestBody User loginRequest) {
    //     String result = userService.login(loginRequest.getEmail(), loginRequest.getPassword());
    //     return ResponseEntity.ok(result);
    // }

}
