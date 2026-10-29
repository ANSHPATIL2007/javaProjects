import java.util.Random;
import java.util.Scanner;
import java.util.Random;
public class NumberGuessingGame {
    public static void main(String[] args) {

        Random rand = new Random();
        Scanner sc = new Scanner(System.in);

        int guess ;
        int attempts = 0;
        int min = 1;
        int max = 100;
        int randomNumber = rand.nextInt(min,max + 1);

        System.out.println("Welcome to NumberGuessingGame");
        System.out.printf("Guess a number between %d and %d\n",min,max);

        do{
            System.out.printf("Guess a number ");
            guess = sc.nextInt();
            attempts ++;

            if(guess < randomNumber){
                System.out.println("too low ! try again");
            }
            else if(guess > randomNumber){
                System.out.println("too high ! try again");
            }
            else{
                System.out.println("You guessed a number ");
                System.out.println("# no of attempts : " + attempts);
            }

        }while (guess != randomNumber);

        sc.close();

    }
}
