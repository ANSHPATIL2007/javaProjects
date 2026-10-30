import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class CountdownTimer {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Timer timer = new Timer();

        System.out.println("Enter time in seconds: ");
        TimerTask task = new TimerTask() {


            int count = input.nextInt();

            @Override
            public void run() {

                System.out.println(count);
                count--;
                if (count <= 0) {
                    System.out.println("happy new year");
                    timer.cancel();
                }
            }
        };
        timer.scheduleAtFixedRate(task, 0, 1000);
    }
}
