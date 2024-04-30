package Exercises;

public class MyNumber {
    private int number;

    MyNumber(int number) {
        this.number = number;
    }

    public boolean isPrime() {
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public int sumUptoN() {
        int sum = 0;
        for (int i = 1; i <= number; i++) {
            sum += i;
        }
        return sum;
    }

    public int sumOfDivisors() {
        int sum = 0;
        for (int i=2; i< number; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        return sum;
    }

    public void printANumberTriangle() {
        String triangleNumber = "";
        for (int i = 1; i <= number; i++) {
            triangleNumber += i + " ";
            System.out.println(triangleNumber);
        }
    }
}
