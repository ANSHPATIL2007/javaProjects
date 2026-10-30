import javax.sound.sampled.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.time.LocalTime;
import java.util.Scanner;

public class Alarm implements Runnable{

    private final LocalTime alarmTime ;
    private final String filePath;
    private final Scanner input;
    Alarm(LocalTime alrmTime ,String filePath , Scanner input){
        this.filePath = filePath;
        this.alarmTime = alrmTime;
        this.input = input;
    }

    @Override
    public void run() {

        while(LocalTime.now().isBefore(alarmTime)){
            try {
                Thread.sleep(1000);

                LocalTime currentTime = LocalTime.now();

                System.out.printf("\r%02d:%02d:%02d", currentTime.getHour(), currentTime.getMinute(),
                        currentTime.getSecond());
            } catch (InterruptedException e) {
                System.out.println("thread interrupted");
            }
        }
        System.out.println("\nAlarm Noices");
        playAlarm(filePath);
    }
    private void playAlarm(String fileName)  {

        File audioFile = new File(fileName);


        try (AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(audioFile);){
            Clip clip = AudioSystem.getClip();
            clip.open(audioInputStream);
            clip.start();
            System.out.println("press enter to stop the alarm :");
            input.nextLine();
            clip.stop();


            input.close();
        }
        catch (UnsupportedAudioFileException e){
            System.out.println("Audio file not supported");
        }
        catch (LineUnavailableException e) {
            System.out.println("Audio line not available");
        }
        catch (IOException e){
            System.out.println("IO error");
        }
    }
}
