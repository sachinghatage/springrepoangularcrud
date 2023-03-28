package com.example.springbootangularcrud.repository;

import com.example.springbootangularcrud.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Integer> {
}
