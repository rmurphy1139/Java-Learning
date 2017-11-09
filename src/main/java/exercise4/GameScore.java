package exercise4;

public class GameScore {
    private Score Player1Score;
    private Score Player2Score;

    public GameScore(Score player1Score, Score player2Score) {
        Player1Score = player1Score;
        Player2Score = player2Score;
    }

    public Score getPlayer1Score() {
        return Player1Score;
    }

    public void setPlayer1Score(Score player1Score) {
        Player1Score = player1Score;
    }

    public Score getPlayer2Score() {
        return Player2Score;
    }

    public void setPlayer2Score(Score player2Score) {
        Player2Score = player2Score;
    }
}
