package com.quiz.QuizApp.controllers;

import com.quiz.QuizApp.models.Student;
import com.quiz.QuizApp.services.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RequestMapping("students")
@RestController
@RequiredArgsConstructor
public class StudentController {
    private final StudentService studentService;
    @GetMapping("")
    public List<Student> listStudents() {
        return studentService.findAll();
    }

}
