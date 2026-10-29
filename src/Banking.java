import java.util.Scanner;

public class Banking {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        //JAVA BANKING PROGRAM FOR BEGINNERS


        double balance = 0;
        boolean isRunning = true;
        int choice;

        while(isRunning){
            System.out.println("*********************");
            System.out.printf("Banking program ");
            System.out.println("*********************");
            System.out.println("1.show balance");
            System.out.println("2.Deposit");
            System.out.println("3.Withdraw");
            System.out.println("4.Exit");
            System.out.println("*********************");

            System.out.println("Enter your choice (1-4):");
            choice = sc.nextInt();

            switch (choice) {
                case 1 -> showBalance(balance);
                case 2 -> balance += deposit(balance);
                case 3 -> balance -= withdraw(balance);
                case 4 -> isRunning = false;
                default -> System.out.println("Invalid input");
            }
        }

        System.out.printf("***********************");
        System.out.printf("thank you !");
        System.out.printf("***********************");
        sc.close();
    }
    static void showBalance(double balance){
        System.out.println("*********************");
        System.out.printf("Your balance is $%.2f\n",balance);
    }
    static double deposit(double balance){

        double amount = 0;

        System.out.println("Enter amount to deposit:");
        amount = sc.nextDouble();

        if(amount < 0){
            System.out.println("Amount can't be negative");
            return 0;
        }
        else {
            return amount ;
        }
    }
    static double withdraw(double balance){
        double amount = 0;

        System.out.println("Enter amount to withdraw:");
        amount = sc.nextDouble();

        if(balance < amount){
            System.out.println("insufficient funds");
            return 0;
        }
        else if(amount < 0 ){
            System.out.println("Amount can't be negative");
            return 0;
        }
        else {
            return amount ;
        }
    }
}
