package exercise2;

public class SumOfNumbers {

    public int sumOfOneToNumber(int num) {

        int y = 0;

        for (int x = 1; x <= num; x++)
        {
            y += x;

        }

        return y;
    }
}
