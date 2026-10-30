import javax.sound.sampled.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class MusicPlayer {

    public static void main(String[] args) {

        String filePath = "src\\Aari Aari Dhurandhar The Revenge 320 Kbps.wav";
        File file = new File(filePath);

        try(Scanner scanner = new Scanner(System.in);
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);){



            Clip clip = AudioSystem.getClip();
            clip.open(audioStream);


            String response = "";
            while(!response.equals("Q")){
                System.out.println("P = play");
                System.out.println("S = stop");
                System.out.println("R = reset");
                System.out.println("Q = quit");
                System.out.println("Enter your choice :");

                response = scanner.nextLine().toUpperCase();

                switch(response){
                    case "P" -> clip.start();
                    case "S" -> clip.stop();
                    case "R" -> clip.setMicrosecondPosition(0);
                    case "Q" -> clip.close();
                    default -> System.out.println("Invalid choice");
                }
            }
        }
        catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
        catch(UnsupportedAudioFileException e){
            System.err.println("Unsupported Audio File");
        }
        catch (LineUnavailableException e){
            System.err.println("Line not available");
        }
        catch(IOException e){
            System.out.println("Something went wrong");
        }
        finally {
            System.out.println("Closing program");

        }

    }
}
