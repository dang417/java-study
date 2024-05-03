package exceptionhandling;

import java.util.Scanner;

public class FinallyRunner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            int[] numbers = {12, 3, 4, 5};
            int number = numbers[5];
            scanner.close();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("Before Scanner close");
            scanner.close();
        }

        System.out.println("Just before closing out main");
    }
}
