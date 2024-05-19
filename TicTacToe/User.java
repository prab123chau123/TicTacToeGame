package com.systemDesign.DesignPatter.TicTacToe;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Setter
@Getter
@Builder
public class User {
private String userName;
final String userId;
}
