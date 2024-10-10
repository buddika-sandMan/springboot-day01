package edu.icet.crm.controller;

import edu.icet.crm.model.Student;
import edu.icet.crm.service.StudentService;
import edu.icet.crm.service.StudentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@CrossOrigin
public class studentController {

    @Autowired
    StudentService service;

    @GetMapping("get-student")
    public Student getStudent() {
        Student student = service.getStudent();
        return student;
    }

    @GetMapping("get-students")
    public List<Student> getAllStudents() {
        Student student1 = service.getStudent();
        Student student2 = service.getStudent();
        Student student3 = service.getStudent();

        return Arrays.asList(student1,student2,student3);
    }

}
