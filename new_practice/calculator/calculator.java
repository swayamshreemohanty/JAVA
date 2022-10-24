import java.util.Scanner;

public class calculator {

    static void sum(Scanner scanner) {
        System.out.println("This is sum for 2 numbers only");

        System.out.println("Enter your first number");
        int number1 = 0;
        number1 = scanner.nextInt();
        System.out.println("Enter your second number");
        int number2 = scanner.nextInt();
        System.out.format("The SUM of %d and %d is %d", number1, number2, number1 + number2);
        return;
    }

    static void substraction(Scanner scanner) {
        System.out.println("This is substraction for 2 numbers only");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your first number");
        int number1 = input.nextInt();
        System.out.println("Enter your second number");
        int number2 = input.nextInt();
        System.out.format("The SUBSTRACTION of %d and %d is %d", number1, number2, number1 - number2);
        input.close();
    }

    static void multiplication(Scanner scanner) {
        System.out.println("This is multiplication for 2 numbers only");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your first number");
        int number1 = input.nextInt();
        System.out.println("Enter your second number");
        int number2 = input.nextInt();
        System.out.format("The MULTIPLICATION of %d and %d is %d", number1, number2, number1 * number2);
        input.close();
    }

    static void division(Scanner scanner) {
        System.out.println("This is division for 2 numbers only");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your first number");
        float number1 = input.nextFloat();
        System.out.println("Enter your second number");
        float number2 = input.nextFloat();
        System.out.format("The DIVISION of %f and %f is %f", number1, number2, number1 / number2);
        input.close();
    }

    public static void main(String[] args) {
        System.out.println("Enter your choice");
        System.out.println("Enter 1 for SUM");
        System.out.println("Enter 2 for SUBSTRACTION");
        System.out.println("Enter 3 for MULTIPLICATION");
        System.out.println("Enter 4 for DIVISION");

        Scanner input = new Scanner(System.in);
        int operation = input.nextInt();

        switch (operation) {
            case 1:
                sum(input);
                break;

            case 2:
                substraction(input);
                return;

            case 3:
                multiplication(input);
                return;

            case 4:
                division(input);
                return;

            default:
                System.out.println("Invalid entry");
                break;
        }
        input.close();
    }
}
