package com.example.springbootangularcrud.service;

import com.example.springbootangularcrud.model.Student;
import com.example.springbootangularcrud.repository.StudentRepository;
import com.example.springbootangularcrud.util.StudentUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImpl implements IStudentService{

    @Autowired
  private StudentRepository repository;

   // @Autowired
    //private StudentUtil util;


    @Override
    public Integer saveStudent(Student s) {
      // util.calculateDtls(s);
        StudentUtil.calculateDtls(s);
        repository.save(s);
        return s.getStdId();
    }

    @Override
    public void updateStudent(Student s) {

        StudentUtil.calculateDtls(s);
        repository.save(s);
    }

    @Override
    public void deleteStudent(Integer id) {

        repository.deleteById(id);
    }

    @Override
    public Student getOneStudent(Integer id) {
        Optional<Student> opt = repository.findById(id);
        if(opt.isPresent()){
            opt.get();
        }
        return null;
    }

    @Override
    public List<Student> getAllStudents() {
        return repository.findAll();
    }
}
