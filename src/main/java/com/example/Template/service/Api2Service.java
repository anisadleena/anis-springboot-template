package com.example.Template.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.Template.model.Api2;
import com.example.Template.repository.Api2Repository;

import java.util.List;
import java.util.Optional;

@Service
public class Api2Service {
    @Autowired
    Api2Repository templateRepository;

    public List<Api2> getAllTemplate(){
        List<Api2> templateList = null;
        templateList = templateRepository.findAll();
        System.out.println("statusList : " + templateList);

        return templateList;
    }

    public Optional<Api2> getAllTemplateByID(String id){
        Optional<Api2> templateByID = null;
        templateByID = templateRepository.findById(id);
        System.out.println("statusList : " + templateByID);

        return templateByID;
    }

    public Api2 createTemplate(Api2 templateBody){
        //==================================================================
        //Option 1 :set/get function for create new template inside Service
        //==================================================================
        Api2 newtemplate = new Api2();
        newtemplate.setUserId(templateBody.getUserId());
        newtemplate.setStatusId(templateBody.getStatusId());
        newtemplate.setTaskDescription(templateBody.getTaskDescription());
        newtemplate.setStartDate(templateBody.getStartDate());
        newtemplate.setEndDate(templateBody.getEndDate());
        newtemplate.setProject(templateBody.getProject());
        System.out.println("templateBody.getProject(): " +templateBody.getProject());
        System.out.println("new.getProject(): " +newtemplate.getUserId());

        try {
            newtemplate = templateRepository.save(newtemplate);
            System.out.println("template created successfully: " + newtemplate);
        } catch (Exception e) {
            System.out.println("Failed to create template");
            e.printStackTrace();
            throw e; // You may want to handle this exception according to your application's requirements
        }

        //==================================================================
        //Option 2 :set/get function for create new template inside Model
        //==================================================================
        //newtemplate.createtemplate(templateBody);
        //==================================================================

        System.out.println("newtemplate :: "+ newtemplate);
        templateRepository.save(newtemplate);
        return newtemplate;
    }

    public Optional<Api2> deleteTemplateById(String id){
        Optional<Api2> deletetemplateByid = null;
        deletetemplateByid = templateRepository.findById(id);
        templateRepository.delete(deletetemplateByid.get());
        return deletetemplateByid;
    }

    public Optional<Api2> updateTemplate(String id, Api2 templateUpdBody){
        Optional<Api2> optionaltemplate = templateRepository.findById(id);

        Api2 existingtemplate = optionaltemplate.get();
        existingtemplate.setUserId(templateUpdBody.getUserId());
        existingtemplate.setStatusId(templateUpdBody.getStatusId());
        existingtemplate.setTaskDescription(templateUpdBody.getTaskDescription());
        existingtemplate.setStartDate(templateUpdBody.getStartDate());
        existingtemplate.setEndDate(templateUpdBody.getEndDate());
        existingtemplate.setProject(templateUpdBody.getProject());
        System.out.println("templateBody.getProject(): " +templateUpdBody.getProject());
        System.out.println("new.getProject(): " +existingtemplate.getUserId());
        templateRepository.save(existingtemplate);

        return optionaltemplate;
    }
}