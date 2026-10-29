import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {

    public static void main(String[] args) {

        //ROCK PAPER SCISSOR

        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        String [] choices = {"rock","paper","scissors"};
        String playerChoice ;
        String computerChoice ;
        String playAgain = "";


        do{
            System.out.println("Enter your choice (rock, paper, scissors): )");
            playerChoice = sc.nextLine().toLowerCase();

            if(!playerChoice.equals("rock") && !playerChoice.equals("paper") && !playerChoice.equals("scissors")){
                System.out.println("Invalid choice.");
                continue;
            }

            computerChoice = choices[rand.nextInt(choices.length)];
            System.out.printf("Computer choice: %s\n", computerChoice);

            if(playerChoice.equals(computerChoice)){
                System.out.println("it's a tie!");
            }
            else if(playerChoice.equals("rock") && computerChoice.equals("scissors")
                    || playerChoice.equals("paper") && computerChoice.equals("rock")
                    || playerChoice.equals("scissors") && computerChoice.equals("paper")){
                System.out.println("you win !");
            }
            else{
                System.out.println("you lost !");
            }

            System.out.println("play again (y/n)");
            playAgain = sc.nextLine().toLowerCase();

        }while(playAgain.equals("y"));


        System.out.println("thanks for playing!");

        sc.close();



    }
}
