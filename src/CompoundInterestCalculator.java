import java.util.Scanner;

public class CompoundInterestCalculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double principle;
        double rate;
        int timesCompound ;
        int years ;
        double amount;

        System.out.println("Enter the Principle");
        principle = sc.nextDouble();

        System.out.println("Enter the Rate(in %)");
        rate = sc.nextDouble() / 100;

        System.out.println("Enter the number of times compounded per year");
        timesCompound = sc.nextInt();

        System.out.println("Enter the years ");
        years = sc.nextInt();

        amount = principle * Math.pow(1 + rate / timesCompound ,timesCompound*years);

        System.out.println("the amount after " + years + " years is " + amount + ".");
        sc.close();
    }
}
