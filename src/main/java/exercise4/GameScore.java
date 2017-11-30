package exercise4;

public class GameScore {
    private Score player1Score;
    private Score player2Score;

    public GameScore(Score player1Score, Score player2Score) {
        this.player1Score = player1Score;
        this.player2Score = player2Score;
    }

    public Score getPlayer1Score() {
        return player1Score;
    }

    public void setPlayer1Score(Score player1Score) {
        this.player1Score = player1Score;
    }

    public Score getPlayer2Score() {
        return player2Score;
    }

    public void setPlayer2Score(Score player2Score) {
        this.player2Score = player2Score;
    }
}
