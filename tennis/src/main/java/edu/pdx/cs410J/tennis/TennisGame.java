package edu.pdx.cs410J.tennis;

public class TennisGame {

  private final Player player1 = new Player();
  private final Player player2 = new Player();

  public int getPlayer1Score() {
    return this.player1.getScore();
  }

  public int getPlayer2Score() {
    return this.player2.getScore();
  }

  void player1WinsVolley() {
    this.player1.winVolley(this.player2.getScore());
  }

  void player2WinsVolley() {
    this.player2.winVolley(this.player1.getScore());
  }

  public boolean player1IsWinner() {
    return this.player1.isWinner();
  }

  private static class Player {

    private int score = 0;
    private boolean isWinner = false;

    int getScore() {
      return score;
    }

    void winVolley(int opponentScore) {
      this.score = nextScore(this.score, opponentScore);
    }

    private int nextScore(int currentScore, int opponentScore) {
      switch (currentScore) {
        case 0:
          return 15;
        case 15:
          return 30;
        case 30:
          return 40;
        case 40:
          if (opponentScore != 40) {
            this.isWinner = true;
          }
          return 40;
        default:
          throw new UnsupportedOperationException("Don't know how to get score after " + currentScore);
      }
    }

    public boolean isWinner() {
      return this.isWinner;
    }
  }
}
