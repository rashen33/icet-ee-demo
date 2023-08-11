package edu.icet.web.controller;

import edu.icet.web.dto.Student;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@CrossOrigin
public class StudentController {
    @GetMapping("/student")
    public ArrayList<Student> getStudent(){
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student("Rashen","Fernando"));
        list.add(new Student("Shan","Basnayake"));
        list.add(new Student("Niroth","Samarawikrama"));
        return list;
    }
}
