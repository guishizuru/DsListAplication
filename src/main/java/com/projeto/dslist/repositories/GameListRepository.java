package com.projeto.dslist.repositories;

import com.projeto.dslist.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameListRepository extends JpaRepository<Game, Long> {

}
