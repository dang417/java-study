package exceptionhandling;

import java.util.Scanner;

public class TryWithRecourcesRunner {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int[] numbers = {12, 3, 4, 5};
            int number = numbers[5];
        }
    }
}
