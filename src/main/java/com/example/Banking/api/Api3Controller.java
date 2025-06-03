package com.example.Banking.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.Banking.model.Api1;
import com.example.Banking.model.Api3;
import com.example.Banking.service.Api3Service;

import java.util.List;

@RequestMapping("api/v1/template/user")
@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class Api3Controller {
    @Autowired
    Api3Service userService;

    @GetMapping("/get/All")
    public ResponseEntity<List<Api3>> getAllUser(){
        List<Api3> user = userService.getAllUser();
        return ResponseEntity.ok(user);
    }

}
