package com.projeto.dslist.service;

import com.projeto.dslist.dto.GameListDTO;
import com.projeto.dslist.entities.Game;
import com.projeto.dslist.entities.GameList;
import com.projeto.dslist.repositories.GameListRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class GameListService {

  @Autowired
  private GameListRepository  gameListRepository;

  @Transactional(readOnly = true)
  public List<GameListDTO> findAll() {
    List<GameList> result = gameListRepository.findAll();
    return result.stream().map(GameListDTO::new).toList();
  }

}
