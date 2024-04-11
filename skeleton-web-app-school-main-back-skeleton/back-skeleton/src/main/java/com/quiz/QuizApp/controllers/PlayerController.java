package com.quiz.QuizApp.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import com.quiz.QuizApp.models.Player;
import com.quiz.QuizApp.services.PlayerService;

import java.util.List;

@CrossOrigin
@RequestMapping("students")
@RestController
@RequiredArgsConstructor
public class PlayerController {
    private final PlayerService playerService;
    @GetMapping("")
    public List<Player> listStudents() {
        return playerService.findAll();
    }

}
