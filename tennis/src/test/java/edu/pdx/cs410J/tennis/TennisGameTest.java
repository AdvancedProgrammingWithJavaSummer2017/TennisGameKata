package edu.pdx.cs410J.tennis;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;

/**
 * Unit tests for the {@link TennisGame} class.
 */
public class TennisGameTest {
  
  @Test
  public void initiallyBothPlayersHaveAScoreOf0() {
    TennisGame game = new TennisGame();
    assertThat(game.getPlayer1Score(), equalTo(0));
    assertThat(game.getPlayer2Score(), equalTo(0));
  }

  @Test
  public void whenPlayer1WinsVolleyPlayer1HasScoreOf15() {
    TennisGame game = new TennisGame();
    game.player1WinsVolley();
    assertThat(game.getPlayer1Score(), equalTo(15));
    assertThat(game.getPlayer2Score(), equalTo(0));
  }

  @Test
  public void whenPlayer2WinsVolleyPlayer2HasScoreOf15() {
    TennisGame game = new TennisGame();
    game.player2WinsVolley();
    assertThat(game.getPlayer1Score(), equalTo(0));
    assertThat(game.getPlayer2Score(), equalTo(15));
  }

  @Test
  public void whenPlayer1WinsTwoVolleysPlayer1HasScoreOf30() {
    TennisGame game = new TennisGame();
    game.player1WinsVolley();
    game.player1WinsVolley();
    assertThat(game.getPlayer1Score(), equalTo(30));
    assertThat(game.getPlayer2Score(), equalTo(0));
  }

  @Test
  public void whenPlayer1WinsThreeVolleysPlayer1HasScoreOf40() {
    TennisGame game = new TennisGame();
    game.player1WinsVolley();
    game.player1WinsVolley();
    game.player1WinsVolley();
    assertThat(game.getPlayer1Score(), equalTo(40));
    assertThat(game.getPlayer2Score(), equalTo(0));
  }

  @Test
  public void whenPlayer1WinsFourVolleysPlayer1HasWonTheGame() {
    TennisGame game = new TennisGame();
    game.player1WinsVolley();
    game.player1WinsVolley();
    game.player1WinsVolley();
    game.player1WinsVolley();
    assertThat(game.player1IsWinner(), equalTo(true));
  }

  @Test
  public void player1WinsVolleyWhenScoreIsTiedAt40() {
    TennisGame game = new TennisGame();
    game.player1WinsVolley();
    game.player1WinsVolley();
    game.player1WinsVolley();
    game.player2WinsVolley();
    game.player2WinsVolley();
    game.player2WinsVolley();
    game.player1WinsVolley();
    assertThat(game.getPlayer1Score(), equalTo(40));
    assertThat(game.getPlayer2Score(), equalTo(40));

    assertThat(game.player1IsWinner(), equalTo(false));
    assertThat(game.player1IsWinner(), equalTo(false));

  }

}
