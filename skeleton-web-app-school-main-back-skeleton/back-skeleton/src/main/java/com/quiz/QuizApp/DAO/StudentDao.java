package com.quiz.QuizApp.DAO;

import com.quiz.QuizApp.models.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface StudentDao extends JpaRepository<Student, Long> {

}
