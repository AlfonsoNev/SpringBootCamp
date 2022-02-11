package com.example.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.model.Test;

@Repository
public interface testRepository extends JpaRepository<Test, Integer>{
	
	List <Test> findAll();
	Test deleteById(int id);
	Test save(Test ut);
}