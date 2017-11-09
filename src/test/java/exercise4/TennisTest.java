package exercise4;

import org.junit.Test;

import static exercise4.Player.*;
import static exercise4.Score.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class TennisTest {
    @Test
    public void score_should_be_LOVE_FIFTEEN_when_player2_scores() {
        final Tennis tennis = new Tennis();
        final GameScore gameScore = new GameScore(LOVE, LOVE);
        final GameScore updatedGameScore = tennis.calculateScore(gameScore, Player2);

        assertThat("Player 1 score is zero", updatedGameScore.getPlayer1Score(), is(LOVE));
        assertThat("Player 2 score is fifteen", updatedGameScore.getPlayer2Score(), is(FIFTEEN));
    }
}
