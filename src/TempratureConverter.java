import java.util.Scanner;

public class TempratureConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double temp;
        double newTemp;
        String unit ;

        System.out.println("Welcome to Temprature Converter");
        System.out.println("Please enter your temperature");
        temp = sc.nextDouble();

        System.out.println("convert to celsius or fahrenheit ? (C or F)");
        unit = sc.next().toUpperCase();

        //(condition) ? true : false
        newTemp = (unit.equals("C")) ? (temp - 32 * 5 / 9) : (temp * 5 / 9) + 32;
        System.out.println("Your temperature is: " + newTemp);

        sc.close();
    }
}
