package com.example.Template.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import java.sql.Time;
import java.time.LocalDate;

@Entity
@Table(name="template")
@Getter
@Setter
public class Api2 {

    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name ="uuid2", strategy = "org.hibernate.id.UUIDGenerator")
    @Column(name = "id")
    private String id;

    @Column(name="user_id")
    private Integer userId;

    @Column(name="status_id")
    private Integer statusId;

    @Column(name="task_description")
    private String taskDescription;

    @Column(name="start_date")
    private LocalDate startDate;

    @Column(name="end_date")
    private LocalDate endDate;

    @Column(name="project")
    private String project;

    //==================================================================
    //Option 2 :set/get function for create new template inside Model
    //==================================================================
    //public void createtemplate (template TemplateBody) {
    //   userId = templateBody.getUserId();
    //   statusId = templateBody.getStatusId();
    //   taskDescription = templateBody.getTaskDescription();
    //   startDate = templateBody.getStartDate();
    //   endDate = templateBody.getEndDate();
    //   project = templateBody.getProject();
    //}
    //==================================================================

}
