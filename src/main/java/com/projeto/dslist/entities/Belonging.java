package com.projeto.dslist.entities;


import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;


@AllArgsConstructor
@Data
@EqualsAndHashCode
@Entity
@Table(name = "tb_belonging")
public class Belonging {

  @EmbeddedId
  private BelongingPK id = new BelongingPK();

  private Integer position;

  public Belonging(Game game, GameList  List, Integer position) {
    id.setGame(game);
    id.setGameList(List);
    this.position = position;
  }

  public Belonging() {

  }
}
