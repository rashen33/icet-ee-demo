package edu.icet.web.controller;

import edu.icet.web.dto.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    @GetMapping("/get-student")
    public Student getStudent(){
        Student student = new Student();
        student.setFirstName("Rashen");
        student.setLastName("Fernando");
        return student;
    }

    @GetMapping("/get-student-two")
    public Student getStudent1(){
        Student student = new Student();
        student.setFirstName("Chamika");
        student.setLastName("Fernando");
        return student;
    }
}
