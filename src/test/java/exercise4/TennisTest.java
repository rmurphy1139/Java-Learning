package exercise4;

import org.junit.Before;
import org.junit.Test;

import static exercise4.GameState.*;
import static exercise4.Player.*;
import static exercise4.Score.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class TennisTest {
    Tennis tennis;
    GameStatus gameStatus;

    @Before
    public void setup() {
        tennis = new Tennis();
    }

    @Test
    public void score_should_be_LOVE_FIFTEEN_when_player2_scores() {
        gameStatus = new GameStatus(LOVE, LOVE);
        GameStatus updatedGameStatus = tennis.calculateScore(gameStatus, Player2);

        assertThat("Game should be in progress", updatedGameStatus.calculateGameState(), is(IN_PROGRESS));
        assertThat("Player 1 score should be zero", updatedGameStatus.getPlayer1Score(), is(LOVE));
        assertThat("Player 2 score should be fifteen", updatedGameStatus.getPlayer2Score(), is(FIFTEEN));
    }

    @Test
    public void score_should_be_FIFTEEN_LOVE_when_player1_scores() {
        gameStatus = new GameStatus(LOVE, LOVE);
        GameStatus updatedGameStatus = tennis.calculateScore(gameStatus, Player1);

        assertThat("Player 1 score should be fifteen", updatedGameStatus.getPlayer1Score(), is(FIFTEEN));
        assertThat("Player 2 score should be zero", updatedGameStatus.getPlayer2Score(), is(LOVE));
    }

    @Test
    public void score_should_be_THIRTY_LOVE_when_player1_scores() {
        gameStatus = new GameStatus(FIFTEEN, LOVE);
        GameStatus updatedGameStatus = tennis.calculateScore(gameStatus, Player1);

        assertThat("Player 1 score should be thirty", updatedGameStatus.getPlayer1Score(), is(THIRTY));
        assertThat("Player 2 score should be zero", updatedGameStatus.getPlayer2Score(), is(LOVE));
    }

    @Test
    public void score_should_be_ZERO_THIRTY_when_player2_scores() {
        gameStatus = new GameStatus(LOVE, FIFTEEN);
        GameStatus updatedGameStatus = tennis.calculateScore(gameStatus, Player2);

        assertThat("Player 1 score should be zero", updatedGameStatus.getPlayer1Score(), is(LOVE));
        assertThat("Player 2 score should be thirty", updatedGameStatus.getPlayer2Score(), is(THIRTY));
    }

    @Test
    public void score_should_be_FIFTEEN_FIFTEEN_when_player2_scores() {
        gameStatus = new GameStatus(FIFTEEN, LOVE);
        GameStatus updatedGameStatus = tennis.calculateScore(gameStatus, Player2);

        assertThat("Player 1 score should be fifteen", updatedGameStatus.getPlayer1Score(), is(FIFTEEN));
        assertThat("Player 2 score should be fifteen", updatedGameStatus.getPlayer2Score(), is(FIFTEEN));
    }

    @Test
    public void score_should_be_FIFTEEN_FIFTEEN_when_player1_scores() {
        gameStatus = new GameStatus(LOVE, FIFTEEN);
        GameStatus updatedGameStatus = tennis.calculateScore(gameStatus, Player1);

        assertThat("Player 1 score should be fifteen", updatedGameStatus.getPlayer1Score(), is(FIFTEEN));
        assertThat("Player 2 score should be fifteen", updatedGameStatus.getPlayer2Score(), is(FIFTEEN));
    }

    @Test
    public void score_should_be_THIRTY_FIFTEEN_when_player1_scores() {
        gameStatus = new GameStatus(FIFTEEN, FIFTEEN);
        GameStatus updatedGameStatus = tennis.calculateScore(gameStatus, Player1);

        assertThat("Player 1 score should be thirty", updatedGameStatus.getPlayer1Score(), is(THIRTY));
        assertThat("Player 2 score should be fifteen", updatedGameStatus.getPlayer2Score(), is(FIFTEEN));
    }

    @Test
    public void score_should_be_FIFTEEN_THIRTY_when_player2_scores() {
        gameStatus = new GameStatus(FIFTEEN, FIFTEEN);
        GameStatus updatedGameStatus = tennis.calculateScore(gameStatus, Player2);

        assertThat("Player 1 score should be fifteen", updatedGameStatus.getPlayer1Score(), is(FIFTEEN));
        assertThat("Player 2 score should be thirty", updatedGameStatus.getPlayer2Score(), is(THIRTY));
    }

    @Test
    public void score_should_be_THIRTY_THIRTY_when_player2_scores() {
        gameStatus = new GameStatus(THIRTY, FIFTEEN);
        GameStatus updatedGameStatus = tennis.calculateScore(gameStatus, Player2);

        assertThat("Player 1 score should be thirty", updatedGameStatus.getPlayer1Score(), is(THIRTY));
        assertThat("Player 2 score should be thirty", updatedGameStatus.getPlayer2Score(), is(THIRTY));
    }

    @Test
    public void score_should_be_THIRTY_THIRTY_when_player1_scores() {
        gameStatus = new GameStatus(FIFTEEN, THIRTY);
        GameStatus updatedGameStatus = tennis.calculateScore(gameStatus, Player1);

        assertThat("Player 1 score should be thirty", updatedGameStatus.getPlayer1Score(), is(THIRTY));
        assertThat("Player 2 score should be thirty", updatedGameStatus.getPlayer2Score(), is(THIRTY));
    }

    @Test
    public void score_should_be_FOURTY_THIRTY_when_player1_scores() {
        gameStatus = new GameStatus(THIRTY, THIRTY);
        GameStatus updatedGameStatus = tennis.calculateScore(gameStatus, Player1);

        assertThat("Player 1 score should be forty", updatedGameStatus.getPlayer1Score(), is(FORTY));
        assertThat("Player 2 score should be thirty", updatedGameStatus.getPlayer2Score(), is(THIRTY));
    }

    @Test
    public void score_should_be_THIRTY_FORTY_when_player2_scores() {
        gameStatus = new GameStatus(THIRTY, THIRTY);
        GameStatus updatedGameStatus = tennis.calculateScore(gameStatus, Player2);

        assertThat("Player 1 score should be thirty", updatedGameStatus.getPlayer1Score(), is(THIRTY));
        assertThat("Player 2 score should be forty", updatedGameStatus.getPlayer2Score(), is(FORTY));
    }

    @Test
    public void score_should_be_FORTY_LOVE_when_player1_scores() {
        gameStatus = new GameStatus(THIRTY, LOVE);
        GameStatus updatedGameStatus = tennis.calculateScore(gameStatus, Player1);

        assertThat("Player 1 score should be forty", updatedGameStatus.getPlayer1Score(), is(FORTY));
        assertThat("Player 2 score should be love", updatedGameStatus.getPlayer2Score(), is(LOVE));
    }

    @Test
    public void score_should_be_LOVE_FORTY_when_player2_scores() {
        gameStatus = new GameStatus(LOVE, THIRTY);
        GameStatus updatedGameStatus = tennis.calculateScore(gameStatus, Player2);

        assertThat("Player 1 score should be love", updatedGameStatus.getPlayer1Score(), is(LOVE));
        assertThat("Player 2 score should be forty", updatedGameStatus.getPlayer2Score(), is(FORTY));
    }

    @Test
    public void score_should_be_FIFTEEN_FORTY_when_player2_scores() {
        gameStatus = new GameStatus(FIFTEEN, THIRTY);
        GameStatus updatedGameStatus = tennis.calculateScore(gameStatus, Player2);

        assertThat("Player 1 score should be fifteen", updatedGameStatus.getPlayer1Score(), is(FIFTEEN));
        assertThat("Player 2 score should be forty", updatedGameStatus.getPlayer2Score(), is(FORTY));
    }

    @Test
    public void score_should_be_FORTY_FIFTEEN_when_player1_scores() {
        gameStatus = new GameStatus(THIRTY, FIFTEEN);
        GameStatus updatedGameStatus = tennis.calculateScore(gameStatus, Player1);

        assertThat("Player 1 score should be forty", updatedGameStatus.getPlayer1Score(), is(FORTY));
        assertThat("Player 2 score should be fifteen", updatedGameStatus.getPlayer2Score(), is(FIFTEEN));
    }

    @Test
    public void score_should_be_FORTY_FORTY_when_player1_scores() {
        gameStatus = new GameStatus(THIRTY, FORTY);
        GameStatus updatedGameStatus = tennis.calculateScore(gameStatus, Player1);

        assertThat("Game should be in progress", updatedGameStatus.calculateGameState(), is(DUECE));
        assertThat("Player 1 score should be forty", updatedGameStatus.getPlayer1Score(), is(FORTY));
        assertThat("Player 2 score should be forty", updatedGameStatus.getPlayer2Score(), is(FORTY));
    }

    @Test
    public void score_should_be_FORTY_FORTY_when_player2_scores() {
        gameStatus = new GameStatus(FORTY, THIRTY);
        GameStatus updatedGameStatus = tennis.calculateScore(gameStatus, Player2);

        assertThat("Player 1 score should be forty", updatedGameStatus.getPlayer1Score(), is(FORTY));
        assertThat("Player 2 score should be forty", updatedGameStatus.getPlayer2Score(), is(FORTY));
    }

    @Test
    public void score_should_be_FIFTY_FORTY_when_player1_scores() {
        gameStatus = new GameStatus(FORTY, FORTY);
        GameStatus updatedGameStatus = tennis.calculateScore(gameStatus, Player1);

        assertThat("Game should be advantage P1", updatedGameStatus.calculateGameState(), is(ADVANTAGE_P1));
        assertThat("Player 1 score should be fifty", updatedGameStatus.getPlayer1Score(), is(FIFTY));
        assertThat("Player 2 score should be forty", updatedGameStatus.getPlayer2Score(), is(FORTY));
    }

    @Test
    public void score_should_be_FORTY_FIFTY_when_player2_scores() {
        gameStatus = new GameStatus(FORTY, FORTY);
        GameStatus updatedGameStatus = tennis.calculateScore(gameStatus, Player2);

        assertThat("Game should be advantage P2", updatedGameStatus.calculateGameState(), is(ADVANTAGE_P2));
        assertThat("Player 1 score should be forty", updatedGameStatus.getPlayer1Score(), is(FORTY));
        assertThat("Player 2 score should be fifty", updatedGameStatus.getPlayer2Score(), is(FIFTY));
    }
}
