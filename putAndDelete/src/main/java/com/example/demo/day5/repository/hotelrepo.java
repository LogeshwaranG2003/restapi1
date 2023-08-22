package com.example.demo.day5.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.day5.model.hotelmodel;

public interface hotelrepo extends JpaRepository<hotelmodel, Integer> {

}