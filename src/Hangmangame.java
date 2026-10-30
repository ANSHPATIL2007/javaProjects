import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Hangmangame {
    public static void main(String[] args) {

        String filePath = "words";
        ArrayList<String> words = new ArrayList<>();

        try(BufferedReader br = new BufferedReader(new FileReader(filePath))){

            String line;
            while((line = br.readLine()) != null){
                words.add(line.trim());
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("Error opening file");
        }

        Random rand = new Random();

        String word = words.get(rand.nextInt(words.size()));


        Scanner input = new Scanner(System.in) ;
        ArrayList<Character> wordState = new ArrayList<>();
        int wrongGuess = 0;

        for(int i = 0 ; i < word.length() ; i++){
            wordState.add('_');
        }
        System.out.println("***********************");
        System.out.println("Welcome to Hangmangame");
        System.out.println("***********************");

        while(wrongGuess < 6){

            System.out.println(getHangmanArt(wrongGuess));
            System.out.println("Word:");

            for(char ch : wordState){
                System.out.print(ch + " ");
            }
            System.out.println();

            System.out.println("Your guess is : ");
            char guess = input.next().toLowerCase().charAt(0);

            if(word.indexOf(guess) >= 0){
                System.out.println("correct guess\n");

                for(int i = 0 ; i < word.length() ; i++){
                    if(word.charAt(i) == guess){
                        wordState.set(i, guess);
                    }
                }
                if(!wordState.contains('_')){
                    System.out.println(getHangmanArt(wrongGuess));
                    System.out.println("you won ");
                    System.out.println("the word was " + word);
                    break;
                }
            }
            else{
                wrongGuess++;
                System.out.println("wrong guess\n");
            }
        }

        if(wrongGuess >= 6){
            System.out.println(getHangmanArt(wrongGuess));
            System.out.println("game over ");
            System.out.println("the word is :" + word);
        }
        input.nextLine() ;
    }
    static String getHangmanArt(int wrongGuess){

        return switch(wrongGuess){
            case 0 -> """
                    
                    
                    
                     """;
            case 1 ->"""
                      o
                    
                    
                     """;
            case 2 ->"""
                      o
                      |
                    
                     """;
            case 3 ->"""
                      o
                     /|
                    
                     """;
            case 4 ->"""
                      o
                     /|\\
                    
                     """;
            case 5 ->"""
                      o
                     /|\\
                     /
                     """;
            case 6 ->"""
                      o
                     /|\\
                     / \\
                     """;
            default -> "";
        };
    }
}
