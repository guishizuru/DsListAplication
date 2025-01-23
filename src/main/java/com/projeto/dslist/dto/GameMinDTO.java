package com.projeto.dslist.dto;

import com.projeto.dslist.Projections.GameMinProjection;
import com.projeto.dslist.entities.Game;
import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
public class GameMinDTO {

  private long id;
  private String title;
  private Integer year;
  private String imgUrl;
  private String shortDescription;

  public GameMinDTO(Game entity) {
    id = entity.getId();
    title = entity.getTitle();
    year = entity.getYear();
    imgUrl = entity.getImgUrl();
    shortDescription = entity.getShortDescription();
  }
  public GameMinDTO(GameMinProjection Projection) {
    id = Projection.getId();
    title = Projection.getTitle();
    year = Projection.getYear();
    imgUrl = Projection.getImgUrl();
    shortDescription = Projection.getShortDescription();
  }
}
