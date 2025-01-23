package com.projeto.dslist.controllers;

import com.projeto.dslist.dto.GameDTO;
import com.projeto.dslist.dto.GameMinDTO;
import com.projeto.dslist.service.GameService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/games")
public class GameController {
  @Autowired
  GameService gameService;

  @GetMapping
  public List<GameMinDTO> findAll(){
    return gameService.findAll();
  }

  @GetMapping(value = "/{id}")
  public GameDTO findAll(@PathVariable Long id){
    return gameService.findById(id);

  }

}
