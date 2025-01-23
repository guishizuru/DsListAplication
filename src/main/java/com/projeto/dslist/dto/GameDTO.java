package com.projeto.dslist.dto;


import com.projeto.dslist.entities.Game;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.beans.BeanUtils;

@Data
@EqualsAndHashCode
public class GameDTO {

  private Long id;
  private String title;
  private Integer year;
  private String genre;
  private String platforms;
  private Double score;
  private String imgUrl;
  private String shortDescription;
  private String longDescription;

  public GameDTO(Game entity) {
    BeanUtils.copyProperties(entity, this);
  }
}
