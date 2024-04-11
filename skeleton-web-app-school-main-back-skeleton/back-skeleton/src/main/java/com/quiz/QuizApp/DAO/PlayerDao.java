package com.quiz.QuizApp.DAO;

import com.quiz.QuizApp.models.Player;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PlayerDao extends JpaRepository<Player, Long> {

}
