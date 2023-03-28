package com.example.springbootangularcrud.service;

import com.example.springbootangularcrud.model.Student;

import java.util.List;

public interface IStudentService {
    Integer saveStudent(Student s);
    void updateStudent(Student s);
    void deleteStudent(Integer id);
    Student getOneStudent(Integer id);
    List<Student> getAllStudents();
}
