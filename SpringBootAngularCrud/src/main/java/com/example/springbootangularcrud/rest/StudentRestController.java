package com.example.springbootangularcrud.rest;

import com.example.springbootangularcrud.model.Student;
import com.example.springbootangularcrud.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
@CrossOrigin(origins="http://localhost:4200")
public class StudentRestController {

    @Autowired
    private IStudentService service;


    @PostMapping("/create")
    public ResponseEntity<String> saveStudent(@RequestBody Student student){
        Integer id = service.saveStudent(student);
        String body = "student saved with id" + id;
         return ResponseEntity.ok(body);

    }

    @GetMapping("/all")
    public ResponseEntity<List<Student>>  getAllStudents(){
        List<Student> list = service.getAllStudents();
        return ResponseEntity.ok(list);

    }



    @GetMapping("/one/{id}")
    public ResponseEntity<Student>  getOneStudent(@PathVariable Integer id){

        Student s = service.getOneStudent(id);
        return ResponseEntity.ok(s);
    }


    @DeleteMapping("/remove/{id}")
    public ResponseEntity<String> deleteStudent(@PathVariable Integer id){

        service.deleteStudent(id);
        String body="student deleted"+id;
        return ResponseEntity.ok(body);
    }

    @PutMapping("/update")
    public ResponseEntity<String> updateEmployee(@RequestBody Student student){
        service.updateStudent(student);
        String body="student updated"+student.getStdId();
        return ResponseEntity.ok(body);
    }














}
