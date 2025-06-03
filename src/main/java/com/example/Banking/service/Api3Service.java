package com.example.Banking.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Banking.model.Api3;
import com.example.Banking.repository.Api3Repository;

import java.util.List;
import java.util.Optional;

@Service
public class Api3Service {
    @Autowired
    Api3Repository userRepository;

    public List<Api3> getAllUser(){
        List<Api3> userList = null;
        userList = userRepository.findAll();
        System.out.println("userList : " + userList);

        return userList;
    }
}
