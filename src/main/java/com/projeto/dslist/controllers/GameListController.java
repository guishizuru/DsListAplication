package com.projeto.dslist.controllers;

import com.projeto.dslist.dto.GameListDTO;
import com.projeto.dslist.dto.GameMinDTO;
import com.projeto.dslist.service.GameListService;
import com.projeto.dslist.service.GameService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/lists")
public class GameListController {

  @Autowired
  private GameListService gameListService;

  @Autowired
  private GameService gameService;

  @GetMapping
  public List<GameListDTO> findAll() {
    List<GameListDTO> result = gameListService.findAll();
    return result;
  }
  @GetMapping(value = "/{listId}")
  public List<GameMinDTO> findByList(Long listId) {
    List<GameMinDTO> result = gameService.findByList(listId);
    return result;
  }

}
