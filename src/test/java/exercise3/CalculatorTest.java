package exercise3;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class CalculatorTest {
    @Test
    public void should_return_30_when_adding_10_and_20() throws Exception {
        final Calculator calculator = new Calculator();
        final double result = calculator.calculate(Operation.ADD, 10, 20);

        assertThat("The result of adding 10 and 20 is 30", result, is(30.0));
    }

    @Test
    public void should_return_10_when_subtracting_10_from_20() throws Exception {
        final Calculator calculator = new Calculator();
        final double result = calculator.calculate(Operation.SUBTRACT, 20, 10);

        assertThat("The result of subtracting 10 from 20 is 10", result, is(10.0));
    }

    @Test
    public void should_return_point_5_when_dividing_10_by_20() throws Exception {
        final Calculator calculator = new Calculator();
        final double result = calculator.calculate(Operation.DIVIDE, 10, 20);

        assertThat("The result of 10/20 is 0.5", result, is(0.5));
    }

    @Test
    public void should_return_200_when_multiplying_10_and_20() throws Exception {
        final Calculator calculator = new Calculator();
        final double result = calculator.calculate(Operation.MULTIPLY, 10, 20);

        assertThat("The result of multiplying 10 and 20 is 200", result, is(200.0));
    }

    @Test
    public void should_return_5_as_mod_for_25_mod_10() throws Exception {
        final Calculator calculator = new Calculator();
        final double result = calculator.calculate(Operation.MOD, 25, 10);

        assertThat("The result of 25%10", result, is(5.0));
    }
}
