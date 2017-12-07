package exercise4;

import static exercise4.Score.*;

public class Tennis {
    public GameStatus calculateScore(GameStatus currentGameStatus, Player scoringPlayer) {

        if (scoringPlayer == Player.Player1) {

            if (currentGameStatus.getPlayer1Score() == FIFTEEN) {
                return new GameStatus(THIRTY, currentGameStatus.getPlayer2Score());
            }
            if (currentGameStatus.getPlayer1Score() == THIRTY) {
                return new GameStatus(FORTY, currentGameStatus.getPlayer2Score());
            }
            else {
                return new GameStatus(FIFTEEN, currentGameStatus.getPlayer2Score());
            }
        }

        if (scoringPlayer == Player.Player2) {
            if (currentGameStatus.getPlayer2Score() == FIFTEEN) {
                return new GameStatus(currentGameStatus.getPlayer1Score(), THIRTY);
            }
            if (currentGameStatus.getPlayer2Score() == THIRTY) {
                return new GameStatus(currentGameStatus.getPlayer1Score(), FORTY);
            }
            else {
                return new GameStatus(currentGameStatus.getPlayer1Score(), FIFTEEN);
            }
        }
        return null;
    }
}
