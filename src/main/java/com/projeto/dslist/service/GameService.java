package com.projeto.dslist.service;

import com.projeto.dslist.dto.GameDTO;
import com.projeto.dslist.dto.GameMinDTO;
import com.projeto.dslist.entities.Game;
import com.projeto.dslist.repositories.GameRepository;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class GameService {

  @Autowired
  GameRepository gameRepository;

  public List<GameMinDTO> findAll() {
    List<Game> result = gameRepository.findAll();
    return result.stream().map(x -> new GameMinDTO(x)).toList();

  }

  @Transactional(readOnly = true)
  public GameDTO findById(Long id) {
    Game result = gameRepository.findById(id).get();
    return new GameDTO(result);

  }


}
