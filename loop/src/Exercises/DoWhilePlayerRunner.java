package Exercises;

import java.util.Scanner;

public class DoWhilePlayerRunner {
    public static void main(String[] args) {
        int number;
        do {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter a number: ");
            number = input.nextInt();
            if (number == -1) {
                System.out.println("Thank You! Have Fun!");
            } else {
                System.out.println("Cube is " + number*number*number);
            }
        } while (number != -1);
    }
}