package exercise4;

import static exercise4.Score.*;

public class Tennis {
    public GameScore calculateScore(GameScore currentGameScore, Player scoringPlayer) {

        if (scoringPlayer == Player.Player1) {

            if (currentGameScore.getPlayer1Score() == FIFTEEN) {
                return new GameScore(THIRTY, currentGameScore.getPlayer2Score());
            }
            if (currentGameScore.getPlayer1Score() == THIRTY) {
                return new GameScore(FORTY, currentGameScore.getPlayer2Score());
            }
            else {
                return new GameScore(FIFTEEN, currentGameScore.getPlayer2Score());
            }
        }

        if (scoringPlayer == Player.Player2) {
            if (currentGameScore.getPlayer2Score() == FIFTEEN) {
                return new GameScore(currentGameScore.getPlayer1Score(), THIRTY);
            }
            if (currentGameScore.getPlayer2Score() == THIRTY) {
                return new GameScore(currentGameScore.getPlayer1Score(), FORTY);
            }
            else {
                return new GameScore(currentGameScore.getPlayer1Score(), FIFTEEN);
            }
        }
        return null;
    }
}
