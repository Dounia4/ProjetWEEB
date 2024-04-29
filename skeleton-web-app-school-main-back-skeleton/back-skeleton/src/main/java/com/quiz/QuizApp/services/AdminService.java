package com.quiz.QuizApp.services;

import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;
import com.quiz.QuizApp.models.Admin;
import com.quiz.QuizApp.DAO.AdminDao;

@Service
@RequiredArgsConstructor
public class AdminService {

    private final AdminDao adminDao;

    public boolean authenticate(String login, String password) {
        Admin admin = adminDao.findByLogin(login);
        if (admin != null) {
            return admin.getPassword().equals(password);
        }
        return false;
    }
}