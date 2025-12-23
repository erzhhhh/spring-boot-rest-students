package com.erzhenika.demo.rest;

import com.erzhenika.demo.entity.Student;
import jakarta.annotation.PostConstruct;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentRestController {

    private List<Student> students;

    // define @PostConstruct  to load the student data only once!
    @PostConstruct
    public void loadData() {

        students = new ArrayList<>();

        Student student1 = new Student("Pooja", "Patel");
        Student student2 = new Student("Mario", "Rossi");
        Student student3 = new Student("Mary", "Smith");

        students.add(student1);
        students.add(student2);
        students.add(student3);
    }

    // define an endpoint for /students - return a list of students
    @GetMapping("/students")
    public List<Student> getStudents() {
        return students;
    }

    // define endpoint for /students/{studentId} - return student at index
    @GetMapping("students/{studentId}")
    public Student getStudent(@PathVariable int studentId) {

        // check the student id against list size
        if (studentId >= students.size() || studentId < 0) {
            throw new StudentNotFoundException("Student ID not found - " + studentId);
        }

        return students.get(studentId);
    }
}
