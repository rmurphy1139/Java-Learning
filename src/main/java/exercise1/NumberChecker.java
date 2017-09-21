package exercise1;

public class NumberChecker {

    public boolean isOdd(int number) {
        int i = number % 2;
        if (i == 0) {
            return false;

        } else {
            return true;
        }
    }
}

