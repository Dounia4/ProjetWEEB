package com.quiz.QuizApp.DAO;

import com.quiz.QuizApp.models.Admin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface AdminDao extends JpaRepository<Admin, Long> {
    Admin findByLogin(String login);

}