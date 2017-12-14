package exercise4;

import static exercise4.GameState.*;
import static exercise4.Score.*;

public class GameStatus {
    private Score player1Score;
    private Score player2Score;

    public GameStatus(Score player1Score, Score player2Score) {
        this.player1Score = player1Score;
        this.player2Score = player2Score;
    }

    public GameState calculateGameState() {
        if (player1Score == FIFTY && player2Score == FORTY) {
            return ADVANTAGE_P1;
        }
        if (player1Score == FORTY && player2Score == FIFTY) {
            return ADVANTAGE_P2;
        }
        if (player1Score == FIFTY) {
            return WIN_P1;
        }
        if (player2Score == FIFTY) {
            return WIN_P2;
        }
        if (player1Score == FORTY && player2Score == FORTY) {
            return DUECE;
        }
        return IN_PROGRESS;
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
