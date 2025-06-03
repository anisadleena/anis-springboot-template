package com.example.Template.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Template.model.Api1;

@Repository
public interface Api1Repository extends JpaRepository<Api1, Integer> {
}
