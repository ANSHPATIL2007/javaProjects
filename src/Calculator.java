import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double num1;
        double num2;
        double result = 0;
        char operation;
        boolean valid = true;

        System.out.println("Enter the first number");
        num1 = sc.nextDouble();
        System.out.println("Enter the operation(+ ,- ,* ,/ ,^):");
        operation = sc.next().charAt(0);
        System.out.println("Enter the second number");
        num2 = sc.nextDouble();


        switch (operation) {
            case '+' -> result = num1 + num2;
            case '-' -> result = num1 - num2;
            case '*' -> result = num1 * num2;
            case '/' -> {
                if (num2 == 0) {
                    System.out.println("Enter the number to be divided by zero");
                    valid = false;
                }
                else {
                    result = num1 / num2;
                }
            }
            case '^' -> result = Math.pow(num1, num2);
            default -> {
                System.out.println("Invalid input");
                valid = false;
            }
        }
        if (valid) {
            System.out.println("The result is: " + result);
        }
        else {
            System.out.println("Invalid input");
        }

        sc.close();
    }
}
