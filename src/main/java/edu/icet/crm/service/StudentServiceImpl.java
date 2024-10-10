package edu.icet.crm.service;

import edu.icet.crm.model.Student;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService{
    public Student getStudent() {
        Student student = new Student();

        student.setName("Manel");
        student.setAge(25);
        student.setContactnumber("074154265");

        return student;
    }
}
