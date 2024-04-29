package com.quiz.QuizApp.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import com.quiz.QuizApp.models.Admin;
import com.quiz.QuizApp.services.AdminService;

@CrossOrigin
@RequestMapping("admin")
@RestController
@RequiredArgsConstructor
public class AdminController {
    private final AdminService adminService;

    @PostMapping("/login")
    public boolean adminLogin(@RequestBody Admin admin) {
        return adminService.authenticate(admin.getLogin(), admin.getPassword());
    }
}
