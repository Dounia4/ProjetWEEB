package com.quiz.QuizApp.services;

import com.quiz.QuizApp.DAO.PlayerDao;
import com.quiz.QuizApp.models.Player;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class PlayerService {
    private final PlayerDao playerDao;
    public List<Player> findAll() {
        Iterable<Player> it = playerDao.findAll();
        List <Player> users = new ArrayList<>();
        it.forEach(users::add);
        return users ;
    }
}
