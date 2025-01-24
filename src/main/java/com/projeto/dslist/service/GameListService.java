package com.projeto.dslist.service;

import com.projeto.dslist.Projections.GameMinProjection;
import com.projeto.dslist.dto.GameListDTO;
import com.projeto.dslist.entities.Game;
import com.projeto.dslist.entities.GameList;
import com.projeto.dslist.repositories.GameListRepository;
import com.projeto.dslist.repositories.GameRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class GameListService {

  @Autowired
  private GameListRepository  gameListRepository;

  @Autowired
  private GameRepository gameRepository;

  @Transactional(readOnly = true)
  public List<GameListDTO> findAll() {
    List<GameList> result = gameListRepository.findAll();
    return result.stream().map(GameListDTO::new).toList();
  }
  @Transactional(readOnly = true)
  public  void move(Long listId, int sourceIndex, int destinationIndex) {
    List<GameMinProjection> list = gameRepository.searchByList(listId);
    GameMinProjection obj = list.remove(sourceIndex);
    list.add(destinationIndex, obj);

    int min = sourceIndex < destinationIndex ? sourceIndex : destinationIndex;
    int max = sourceIndex > destinationIndex ? sourceIndex : destinationIndex;

    for (int i = min; i <max ; i++) {
      gameListRepository.updateBelongingPosition(listId, list.get(i).getId(),i);
    }
  }

}
