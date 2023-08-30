package com.example.demo.day7.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.day7.model.usermodel;

public interface repo extends JpaRepository<usermodel, Integer>{

}
