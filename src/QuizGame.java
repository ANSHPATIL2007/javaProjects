import java.util.Scanner;

public class QuizGame {
    public static void main(String[] args) {

        //JAVA QUIZ GAME

        String[] questions = {"What is the main function of a router?",
                "which part of the computer is brain?",
                "which year facebook is launched?",
                "who is known as father of computer?",
                "what was the first programming language?"};

        String [][] options  = {{"1.Storing files ", "2.encrypting data ", "3.Directing internet traffic ","4.managing passwords"},
                {"1.CPU,","2.Hard drive","3.ram","4.gpu"},
                {"1.2000","2.2004","3.2006","4.2008"},
                {"1.Steve jobs","2.BillGates","3.Alan turing","4.Charles Babbage"},
                {"1.COBOL","2.C","3.fortran","4.Assembly"}};
        int[] answers = {3 ,1 ,2 ,4 ,3};
        int score = 0;
        int guess ;
        Scanner sc = new Scanner(System.in);

        System.out.printf("****************************");
        System.out.print("Welcome to the Quiz Game!\n");

        for(int i = 0; i < questions.length; i++){
            System.out.println(questions[i]);

            for(String option : options[i]){
                System.out.println(option);
            }

            System.out.println("Enter your guess: ");
            guess = sc.nextInt();

            if(guess == answers[i]){
                System.out.println("Congratulations! You guessed the correct answer.");
                score++;
            }
            else{
                System.out.print("Wrong guess! ");
            }
        }
        System.out.printf("The score is %d.\n", score);

        sc.close();
    }
}

