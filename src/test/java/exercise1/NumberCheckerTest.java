package exercise1;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class NumberCheckerTest {

    @Test
    public void should_return_true_for_5_being_odd() {
        final NumberChecker numberChecker = new NumberChecker();
        final boolean isOdd = numberChecker.isOdd(5);

        assertThat("5 is odd", isOdd, is(true));
    }

    @Test
    public void should_return_false_for_4_being_odd() {
        final NumberChecker numberChecker = new NumberChecker();
        final boolean isOdd = numberChecker.isOdd(4);

        assertThat("4 is not odd", isOdd, is(false));
    }
}
