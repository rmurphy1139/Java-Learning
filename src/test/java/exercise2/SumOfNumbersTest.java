package exercise2;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class SumOfNumbersTest {

    @Test
    public void should_find_the_sum_to_1_to_be_1() {
        final SumOfNumbers sumOfNumbers = new SumOfNumbers();
        final int sumOf1To1 = sumOfNumbers.sumOfOneToNumber(1);

        assertThat("Sum to 1 is 1", sumOf1To1, is(1));
    }

    @Test
    public void should_find_the_sum_to_5_to_be_15() {
        final SumOfNumbers sumOfNumbers = new SumOfNumbers();
        final int sumOf1To1 = sumOfNumbers.sumOfOneToNumber(5);

        assertThat("Sum 1 to 5 is 15", sumOf1To1, is(15));
    }
}
