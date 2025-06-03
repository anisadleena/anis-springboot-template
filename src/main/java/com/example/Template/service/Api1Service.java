package com.example.Template.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Template.model.Api1;
import com.example.Template.repository.Api1Repository;

import java.util.List;

@Service
public class Api1Service {
    @Autowired
    Api1Repository statusRepository;

    public List<Api1> getAllStatus(){
        List<Api1> statusList = null;
        statusList = statusRepository.findAll();
        System.out.println("statusList : " + statusList);

        return statusList;
    }

}
