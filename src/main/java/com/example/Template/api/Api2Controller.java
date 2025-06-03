package com.example.Template.api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.Template.model.Api2;
import com.example.Template.service.Api2Service;

import org.springframework.http.HttpStatus;
import java.util.List;
import java.util.Optional;

@RequestMapping("api/v1/template")
@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class Api2Controller {

    @Autowired
    Api2Service templateService;


    @GetMapping("/get/All")
    public ResponseEntity<List<Api2>> getAllTemplate(){
        List<Api2> template = templateService.getAllTemplate();
        return ResponseEntity.ok(template);
    }

    @GetMapping("/get/{Id}")
    public ResponseEntity<Optional<Api2>> getAllTemplateByID(@PathVariable("Id") String id){
        Optional<Api2> template = templateService.getAllTemplateByID(id);
        return ResponseEntity.ok(template);
    }

    @PostMapping("/create")
    public ResponseEntity<Api2> createTemplate(@RequestBody Api2 template){
        Api2 createdtemplate = templateService.createTemplate(template);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdtemplate);
    }

    @DeleteMapping("/delete/{Id}")
    public ResponseEntity<Optional<Api2>> deleteTemplateById(@PathVariable("Id") String id){
        Optional<Api2> template = templateService.deleteTemplateById(id);
        return ResponseEntity.ok(template);
    }

    @PutMapping("/update/{Id}")
    public ResponseEntity<Api2> updateTemplate(@PathVariable("Id") String id, @RequestBody Api2 templateToUpdate){
        Optional<Api2> updatedtemplateOptional = templateService.updateTemplate(id, templateToUpdate);

        if (updatedtemplateOptional.isPresent()) {
            Api2 updatedtemplate = updatedtemplateOptional.get();
            return ResponseEntity.status(HttpStatus.CREATED).body(updatedtemplate);
        } else {
            // Handle the case where the template with the given id is not found
            return ResponseEntity.notFound().build();
        }
    }

}
