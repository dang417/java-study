package Menu;

import java.util.Scanner;

public class MenuRunner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Number1: ");
        int number1 = scanner.nextInt();
        System.out.println("The number you enterd is - " + number1);

        System.out.println("Enter Number2: ");
        int number2 = scanner.nextInt();
        System.out.println("The number you enterd is - " + number2);

        System.out.println("Please select menu\n1 - Add\n2 - Subtract\n3 - Divide\n4 - Multiply");

        int menuChoice = scanner.nextInt();
        System.out.println("Choose Operation: " + menuChoice);

        performOperationUsingSwitch(menuChoice, number1, number2);


    }

    private static void performOperationUsingSwitch(int menuChoice, int number1, int number2) {
        switch (menuChoice) {
            case 1 :
                System.out.println("Result is - " + Menu.add(number1, number2));
                break;
            case 2 :
                System.out.println("Result is - " + Menu.subtract(number1, number2));
                break;
            case 3 :
                System.out.println("Result is - " + Menu.divide(number1, number2));
                break;
            case 4 :
                System.out.println("Result is - " + Menu.multiply(number1, number2));
        }
    }
}
