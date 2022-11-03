package com.example.SchoolMangamentProject.Controller;

import com.example.SchoolMangamentProject.model.Student;
import com.example.SchoolMangamentProject.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
public class StudentController {

    @Autowired
    private StudentRepository studentRepository;

    @PostMapping("/create")
    public void createStudent(@RequestBody Student student){
        studentRepository.insert(student);
    }

    // Changed PostMapping to DeleteMapping to make it more accurate
    @DeleteMapping ("/delete/{id}")
    public void deleteStudent(@PathVariable String id){
        studentRepository.deleteById(id);
    }

    @GetMapping("/list")
    public List<Student> listStudent(){
        return studentRepository.findAll();
    }




}
