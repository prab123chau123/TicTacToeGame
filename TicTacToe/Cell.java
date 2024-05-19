package com.systemDesign.DesignPatter.TicTacToe;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Builder
public class Cell {
private Integer row;
private Integer col;
private Piece piece;
}
