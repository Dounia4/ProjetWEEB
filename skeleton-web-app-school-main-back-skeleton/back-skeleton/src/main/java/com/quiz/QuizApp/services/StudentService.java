package com.quiz.QuizApp.services;

import com.quiz.QuizApp.DAO.StudentDao;
import com.quiz.QuizApp.models.Student;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentService {
    private final StudentDao studentDao;
    public List<Student> findAll() {
        Iterable<Student> it = studentDao.findAll();
        List <Student> users = new ArrayList<>();
        it.forEach(users::add);
        return users ;
    }



}
