import java.util.Random;
import java.util.Scanner;

public class DiceRoller {

    public static void main(String[] args) {

        //JAVA DICE ROLLER PROGRAM

        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int numOfDice;
        int total = 0;

        System.out.println("enter the # of dice to roll :");
        numOfDice = sc.nextInt();

        if(numOfDice > 0){

            for(int i = 1
                ; i <= numOfDice; i++){
                int roll = rand.nextInt(1,7);
                printDie(roll);
                System.out.println("you rolled " + roll);
                total += roll;
            }
            System.out.println("total" + total);
        }
        else{
            System.out.println("you rolled the dice ");
        }
        sc.close();
    }
    static void printDie(int roll){

        String dice1 = """
                 ------
                |      |
                |   1  |
                |      |
                 ------
                """;
        String dice2 = """
                 ------
                |      |
                |   2  |
                |      |
                 ------
                """;
        String dice3 = """
                 ------
                |      |
                |   3  |
                |      |
                 ------
                """;
        String dice4 = """
                 ------
                |      |
                |   4  |
                |      |
                 ------
                """;
        String dice5 = """
                 ------
                |      |
                |   5  |
                |      |
                 ------
                """;
        String dice6 = """
                 ------
                |      |
                |   6  |
                |      |
                 ------
                """;

        switch(roll){
            case 1 -> System.out.println(dice1);
            case 2 -> System.out.println(dice2);
            case 3 -> System.out.println(dice3);
            case 4 -> System.out.println(dice4);
            case 5 -> System.out.println(dice5);
            case 6 -> System.out.println(dice6);
            default -> System.out.println("Invalid roll");
        }
    }
}
