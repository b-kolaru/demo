package com.example.demo.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping(path = "api/v1/Student")
public class StudentController {

    private final StudentService service;
@Autowired
    public StudentController(StudentService service) {
        this.service = service;
    }




    @GetMapping
    public List<Student> getStudent(){
        return service.getStudents();

    }
}
