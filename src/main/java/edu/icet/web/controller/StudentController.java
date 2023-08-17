package edu.icet.web.controller;

import edu.icet.web.dto.Student;
import edu.icet.web.service.StudentService;
import edu.icet.web.service.StudentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController //Routing
@CrossOrigin
public class StudentController {
    @Autowired
    StudentService studentService;
    @GetMapping("/student")
    public ArrayList<Student> getStudent(){
        return studentService.getStudent();
    }

}
