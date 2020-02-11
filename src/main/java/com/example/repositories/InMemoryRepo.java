package com.example.demo.repositories;

import com.example.demo.Student;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class InMemoryRepo {
    private List<Student> studentList;

}
