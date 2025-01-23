package com.projeto.dslist.entities;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.hibernate.annotations.ManyToAny;

@AllArgsConstructor
@Data
@EqualsAndHashCode
@Embeddable
class BelongingPK {

  @ManyToOne
  @JoinColumn(name = "game_id")
  private Game game;

  @ManyToOne
  @JoinColumn(name = "list_id")
  private GameList gameList;

  public BelongingPK() {

  }
}
