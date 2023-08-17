package edu.icet.web.service;

import edu.icet.web.dto.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class StudentServiceImpl implements StudentService{
    @Override
    public ArrayList<Student> getStudent() {
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student("Rashen","Fernando"));
        list.add(new Student("Rashen","Fernando"));
        list.add(new Student("Rashen","Fernando"));
        return list;
    }
}
