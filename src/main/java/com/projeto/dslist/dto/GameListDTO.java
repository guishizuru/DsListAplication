package com.projeto.dslist.dto;

import com.projeto.dslist.entities.GameList;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class GameListDTO {
  private Long id;
  private String name;

  public GameListDTO(GameList gameList) {
    this.id = gameList.getId();
    this.name = gameList.getName();
  }

}
