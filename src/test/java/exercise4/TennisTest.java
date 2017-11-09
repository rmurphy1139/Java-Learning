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

        assertThat("Player 1 score is zero", updatedGameScore.getPlayer1Score(), is(LOVE));
        assertThat("Player 2 score is fifteen", updatedGameScore.getPlayer2Score(), is(FIFTEEN));
    }

    @Test
    public void score_should_be_FIFTEEN_LOVE_when_player1_scores() {
        gameScore = new GameScore(LOVE, LOVE);
        GameScore updatedGameScore = tennis.calculateScore(gameScore, Player1);

        assertThat("Player 1 score is fifteen", updatedGameScore.getPlayer1Score(), is(FIFTEEN));
        assertThat("Player 2 score is zero", updatedGameScore.getPlayer2Score(), is(LOVE));
    }

    @Test
    public void score_should_be_THIRTY_LOVE_when_player1_scores() {
        gameScore = new GameScore(FIFTEEN, LOVE);
        GameScore updatedGameScore = tennis.calculateScore(gameScore, Player1);

        assertThat("Player 1 score is thirty", updatedGameScore.getPlayer1Score(), is(THIRTY));
        assertThat("Player 2 score is zero", updatedGameScore.getPlayer2Score(), is(LOVE));
    }

    @Test
    public void score_should_be_THIRTY_THIRTY_when_player1_scores() {
        gameScore = new GameScore(FIFTEEN, THIRTY);
        GameScore updatedGameScore = tennis.calculateScore(gameScore, Player1);

        assertThat("Player 1 score is thirty", updatedGameScore.getPlayer1Score(), is(THIRTY));
        assertThat("Player 2 score is thirty", updatedGameScore.getPlayer2Score(), is(THIRTY));
    }
}
