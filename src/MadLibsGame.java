import java.util.Scanner;

public class MadLibsGame {
    public static void main(String[] args) {

        // Mad Libs Game
        Scanner sc = new Scanner(System.in);

        String adjective1;
        String noun1;
        String adjective2;
        String verb1;
        String adjective3;

        System.out.println("Enter an adjective (description):");
        adjective1 = sc.nextLine();
        System.out.println("Enter an noun (animal or person):");
        noun1 = sc.nextLine();
        System.out.println("Enter an adjective (description):");
        adjective2 = sc.nextLine();
        System.out.println("Enter a verb end with -ing (action) :");
        verb1 = sc.nextLine();
        System.out.println("Enter an adjective (description) :");
        adjective3 = sc.nextLine();


        System.out.println("\nToday I went to a " + adjective1 + "zoo");
        System.out.println("In an exhibit, I saw a " + noun1 + ".");
        System.out.println(noun1+ "was" +adjective2 + "and" + verb1 + "!");
        System.out.println("I was " +adjective3 + "!");

        sc.close();
    }
}
