import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class AlarmClock {

    public static void main(String[] args) {

        //JAVA ALARM CLOCK

        Scanner input = new Scanner(System.in);
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
        LocalTime alarmTime =null;
        String filePath = "src\\Aari Aari Dhurandhar The Revenge 320 Kbps.wav";


        while (alarmTime == null) {
            try {
                System.out.println("Welcome to the Alarm Clock!");
                System.out.println("enter an alarm time (HH:mm:ss)");
                String inputTime = input.nextLine();

                alarmTime = LocalTime.parse(inputTime, dtf);
                System.out.println("Alarm time: " + alarmTime);
            }
            catch (DateTimeParseException e) {
                System.out.println("Invalid time format");
            }
        }

        Alarm alarm = new Alarm(alarmTime,filePath,input);
        Thread alarmThread = new Thread(alarm);
        alarmThread.start();


    }
}
