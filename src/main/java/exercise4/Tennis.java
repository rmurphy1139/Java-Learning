package exercise4;

import static exercise4.Score.*;

public class Tennis {
    public GameScore calculateScore(GameScore currentGameScore, Player scoringPlayer) {

        if (scoringPlayer == Player.Player1) {

            if (currentGameScore.getPlayer1Score() == FIFTEEN) {
                return new GameScore(THIRTY, LOVE);
            } else {
                return new GameScore(FIFTEEN, LOVE);
            }
        }
        if (scoringPlayer == Player.Player2) {
            return new GameScore(LOVE, FIFTEEN);
        }
        return null;
    }
}
