package exercise3;

public class Calculator {
    /**
     * Performs a calculation using the provided operation on the two numbers
     *
     * @param operationToPerform arithmetic operation to perform
     * @param num1               first number
     * @param num2               second number
     * @return result of the operation on the numbers
     */
    public double calculate(Operation operationToPerform, double num1, double num2) {

        double answer = 50.0;

        if (operationToPerform == Operation.ADD) {

            answer = num1 + num2;

        } else if (operationToPerform == Operation.SUBTRACT) {

            answer = num1 - num2;
        } else if (operationToPerform == Operation.MULTIPLY) {

            answer = num1 * num2;
        } else if (operationToPerform == Operation.DIVIDE) {

            answer = num1 / num2;
        } else if (operationToPerform == Operation.MOD) {

            answer = num1 % num2;
        }

        return answer;
    }
}
