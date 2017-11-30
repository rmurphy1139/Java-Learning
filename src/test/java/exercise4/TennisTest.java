package exercise4;

import org.junit.Before;
import org.junit.Test;

import static exercise4.Player.*;
import static exercise4.Score.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class TennisTest {
    Tennis tennis;
    GameScore gameScore;

    @Before
    public void setup() {
        tennis = new Tennis();
    }

    @Test
    public void score_should_be_LOVE_FIFTEEN_when_player2_scores() {
        gameScore = new GameScore(LOVE, LOVE);
        GameScore updatedGameScore = tennis.calculateScore(gameScore, Player2);

        assertThat("Player 1 score should be zero", updatedGameScore.getPlayer1Score(), is(LOVE));
        assertThat("Player 2 score should be fifteen", updatedGameScore.getPlayer2Score(), is(FIFTEEN));
    }

    @Test
    public void score_should_be_FIFTEEN_LOVE_when_player1_scores() {
        gameScore = new GameScore(LOVE, LOVE);
        GameScore updatedGameScore = tennis.calculateScore(gameScore, Player1);

        assertThat("Player 1 score should be fifteen", updatedGameScore.getPlayer1Score(), is(FIFTEEN));
        assertThat("Player 2 score should be zero", updatedGameScore.getPlayer2Score(), is(LOVE));
    }

    @Test
    public void score_should_be_THIRTY_LOVE_when_player1_scores() {
        gameScore = new GameScore(FIFTEEN, LOVE);
        GameScore updatedGameScore = tennis.calculateScore(gameScore, Player1);

        assertThat("Player 1 score should be thirty", updatedGameScore.getPlayer1Score(), is(THIRTY));
        assertThat("Player 2 score should be zero", updatedGameScore.getPlayer2Score(), is(LOVE));
    }

    @Test
    public void score_should_be_ZERO_THIRTY_when_player2_scores() {
        gameScore = new GameScore(LOVE, FIFTEEN);
        GameScore updatedGameScore = tennis.calculateScore(gameScore, Player2);

        assertThat("Player 1 score should be zero", updatedGameScore.getPlayer1Score(), is(LOVE));
        assertThat("Player 2 score should be thirty", updatedGameScore.getPlayer2Score(), is(THIRTY));
    }

    @Test
    public void score_should_be_FIFTEEN_FIFTEEN_when_player2_scores() {
        gameScore = new GameScore(FIFTEEN, LOVE);
        GameScore updatedGameScore = tennis.calculateScore(gameScore, Player2);

        assertThat("Player 1 score should be fifteen", updatedGameScore.getPlayer1Score(), is(FIFTEEN));
        assertThat("Player 2 score should be fifteen", updatedGameScore.getPlayer2Score(), is(FIFTEEN));
    }

    @Test
    public void score_should_be_FIFTEEN_FIFTEEN_when_player1_scores() {
        gameScore = new GameScore(LOVE, FIFTEEN);
        GameScore updatedGameScore = tennis.calculateScore(gameScore, Player1);

        assertThat("Player 1 score should be fifteen", updatedGameScore.getPlayer1Score(), is(FIFTEEN));
        assertThat("Player 2 score should be fifteen", updatedGameScore.getPlayer2Score(), is(FIFTEEN));
    }

    @Test
    public void score_should_be_THIRTY_FIFTEEN_when_player1_scores() {
        gameScore = new GameScore(FIFTEEN, FIFTEEN);
        GameScore updatedGameScore = tennis.calculateScore(gameScore, Player1);

        assertThat("Player 1 score should be thirty", updatedGameScore.getPlayer1Score(), is(THIRTY));
        assertThat("Player 2 score should be fifteen", updatedGameScore.getPlayer2Score(), is(FIFTEEN));
    }

    @Test
    public void score_should_be_FIFTEEN_THIRTY_when_player2_scores() {
        gameScore = new GameScore(FIFTEEN, FIFTEEN);
        GameScore updatedGameScore = tennis.calculateScore(gameScore, Player2);

        assertThat("Player 1 score should be fifteen", updatedGameScore.getPlayer1Score(), is(FIFTEEN));
        assertThat("Player 2 score should be thirty", updatedGameScore.getPlayer2Score(), is(THIRTY));
    }

    @Test
    public void score_should_be_THIRTY_THIRTY_when_player2_scores() {
        gameScore = new GameScore(THIRTY, FIFTEEN);
        GameScore updatedGameScore = tennis.calculateScore(gameScore, Player2);

        assertThat("Player 1 score should be thirty", updatedGameScore.getPlayer1Score(), is(THIRTY));
        assertThat("Player 2 score should be thirty", updatedGameScore.getPlayer2Score(), is(THIRTY));
    }

    @Test
    public void score_should_be_THIRTY_THIRTY_when_player1_scores() {
        gameScore = new GameScore(FIFTEEN, THIRTY);
        GameScore updatedGameScore = tennis.calculateScore(gameScore, Player1);

        assertThat("Player 1 score should be thirty", updatedGameScore.getPlayer1Score(), is(THIRTY));
        assertThat("Player 2 score should be thirty", updatedGameScore.getPlayer2Score(), is(THIRTY));
    }

    @Test
    public void score_should_be_FOURTY_THIRTY_when_player1_scores() {
        gameScore = new GameScore(THIRTY, THIRTY);
        GameScore updatedGameScore = tennis.calculateScore(gameScore, Player1);

        assertThat("Player 1 score should be forty", updatedGameScore.getPlayer1Score(), is(FORTY));
        assertThat("Player 2 score should be thirty", updatedGameScore.getPlayer2Score(), is(THIRTY));
    }

    @Test
    public void score_should_be_THIRTY_FORTY_when_player2_scores() {
        gameScore = new GameScore(THIRTY, THIRTY);
        GameScore updatedGameScore = tennis.calculateScore(gameScore, Player2);

        assertThat("Player 1 score should be thirty", updatedGameScore.getPlayer1Score(), is(THIRTY));
        assertThat("Player 2 score should be forty", updatedGameScore.getPlayer2Score(), is(FORTY));
    }

    @Test
    public void score_should_be_FORTY_LOVE_when_player1_scores() {
        gameScore = new GameScore(THIRTY, LOVE);
        GameScore updatedGameScore = tennis.calculateScore(gameScore, Player1);

        assertThat("Player 1 score should be forty", updatedGameScore.getPlayer1Score(), is(FORTY));
        assertThat("Player 2 score should be love", updatedGameScore.getPlayer2Score(), is(LOVE));
    }

    @Test
    public void score_should_be_LOVE_FORTY_when_player2_scores() {
        gameScore = new GameScore(LOVE, THIRTY);
        GameScore updatedGameScore = tennis.calculateScore(gameScore, Player2);

        assertThat("Player 1 score should be love", updatedGameScore.getPlayer1Score(), is(LOVE));
        assertThat("Player 2 score should be forty", updatedGameScore.getPlayer2Score(), is(FORTY));
    }

    @Test
    public void score_should_be_FIFTEEN_FORTY_when_player2_scores() {
        gameScore = new GameScore(FIFTEEN, THIRTY);
        GameScore updatedGameScore = tennis.calculateScore(gameScore, Player2);

        assertThat("Player 1 score should be fifteen", updatedGameScore.getPlayer1Score(), is(FIFTEEN));
        assertThat("Player 2 score should be forty", updatedGameScore.getPlayer2Score(), is(FORTY));
    }

    @Test
    public void score_should_be_FORTY_FIFTEEN_when_player1_scores() {
        gameScore = new GameScore(THIRTY, FIFTEEN);
        GameScore updatedGameScore = tennis.calculateScore(gameScore, Player1);

        assertThat("Player 1 score should be forty", updatedGameScore.getPlayer1Score(), is(FORTY));
        assertThat("Player 2 score should be fifteen", updatedGameScore.getPlayer2Score(), is(FIFTEEN));
    }

    @Test
    public void score_should_be_FORTY_FORTY_when_player1_scores() {
        gameScore = new GameScore(THIRTY, FORTY);
        GameScore updatedGameScore = tennis.calculateScore(gameScore, Player1);

        assertThat("Player 1 score should be forty", updatedGameScore.getPlayer1Score(), is(FORTY));
        assertThat("Player 2 score should be forty", updatedGameScore.getPlayer2Score(), is(FORTY));
    }

    @Test
    public void score_should_be_FORTY_FORTY_when_player2_scores() {
        gameScore = new GameScore(FORTY, THIRTY);
        GameScore updatedGameScore = tennis.calculateScore(gameScore, Player2);

        assertThat("Player 1 score should be forty", updatedGameScore.getPlayer1Score(), is(FORTY));
        assertThat("Player 2 score should be forty", updatedGameScore.getPlayer2Score(), is(FORTY));
    }


}
