package com.quiz.QuizApp.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;

@Entity
@Table(name = "quiz")
@Getter
public class Quiz {
    @Id
    @Column(name = "number_quiz")
    private String number_quiz;

    @Column(name = "image")
    private int image;
}
