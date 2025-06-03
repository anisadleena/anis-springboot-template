package com.example.Template.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Template.model.Api3;

@Repository
public interface Api3Repository extends JpaRepository<Api3, Integer> {
}
