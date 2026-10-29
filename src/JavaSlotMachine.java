import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class JavaSlotMachine {
    public static void main(String[] args) {

        //JAVA SLOT MACHINE

        Scanner sc = new Scanner(System.in);

        int balance = 100;
        int bet;
        int payout;
        String[] row;
        String playAgain;

        System.out.println("**************************");
        System.out.println("welcome to java Slots");
        System.out.println("Symbols : 😍😂😊💕👍");
        System.out.println("***************************");

        while(balance>0){
            System.out.println("Current balance is : $"+balance);
            System.out.println("place tour bet amount :");
            bet = sc.nextInt();
            sc.nextLine();

            if(bet > balance){
                System.out.println("balance is below $"+balance);
                continue;
            }

            else if(bet <= 0){
                System.out.println("bet must be greater than 0.");
                continue;
            }
            else {
                balance -= bet;
            }

            System.out.println("Spinning.....");
            row = spinRow();
            printRow(row);
            payout = getPayout(row , bet);

            if(payout>0){
                System.out.println("You won $" + payout);
                balance += payout;
            }
            else{
                System.out.println("You lost this round ");
            }

            System.out.println("do you want to continue? y/n");
            playAgain = sc.next().toLowerCase();
            if(!playAgain.equals("y")){
                break;
            }
        }

        System.out.println("Thanks for playing!");
        System.out.println("your final balance is : $"+balance);



    }
    static String[] spinRow(){

        String [] symbols = {"😍","😂","😊","💕","👍"};
        String [] row = new String[3];
        Random rand = new Random();


        for(int i = 0; i < 3 ;i++){
            row[i] = symbols[rand.nextInt(symbols.length)];;
        }

        return  row;
    }
    static void printRow(String[] row){
        System.out.println(" "+String.join(" | ",row));
    }
    static int getPayout(String[] row, int bet){

        if(row[0].equals(row[1]) && row[1].equals(row[2])){
            return switch(row[0]){
                case "😍" -> bet * 3;
                case "😂" -> bet * 4;
                case "😊" -> bet * 5;
                case "💕" -> bet * 6;
                case "👍" -> bet * 7;
                default -> 0;
            };
        }
        else if(row[0].equals(row[1]) ){
            return switch(row[0]){
                case "😍" -> bet * 2;
                case "😂" -> bet * 3;
                case "😊" -> bet * 4;
                case "💕" -> bet * 5;
                case "👍" -> bet * 6;
                default -> 0;
            };
        }
        else if(row[1].equals(row[2]) ){
            return switch(row[1]){
                case "😍" -> bet * 2;
                case "😂" -> bet * 3;
                case "😊" -> bet * 4;
                case "💕" -> bet * 5;
                case "👍" -> bet * 6;
                default -> 0;
            };
        }


        return 0;
    }
}
