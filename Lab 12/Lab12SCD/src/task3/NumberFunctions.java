package task3;

public class NumberFunctions {

    public boolean isOdd(int num) {
        return num % 2 != 0;
    }

    public boolean isEven(int num) {
        return num % 2 == 0;
    }

    public boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public int factorial(int num) {
        int result = 1;
        for (int i = 1; i <= num; i++) {
            result *= i;
        }
        return result;
    }
}
