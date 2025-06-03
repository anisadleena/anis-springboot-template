package com.example.Banking.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.Banking.model.Api1;
import com.example.Banking.service.Api1Service;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.List;

@RequestMapping("api/v1/template/status")
@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class Api1Controller {

    @Autowired
    Api1Service statusService;
    

    @GetMapping("/get/All")
    public ResponseEntity<List<Api1>> getAllStatus(){
        System.out.println("==========getAllStatus");
        List<Api1> status = statusService.getAllStatus();
        return ResponseEntity.ok(status);
    }

}
