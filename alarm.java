import java.time.LocalTime;
import java.util.Scanner;

public class Alarm {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Set alarm hour (0-23): ");
        int hour = scanner.nextInt();

        System.out.print("Set alarm minute (0-59): ");
        int minute = scanner.nextInt();

        System.out.println("Alarm set for " + hour + ":" + minute);

        while (true) {
            LocalTime currentTime = LocalTime.now();

            if (currentTime.getHour() == hour &&
                currentTime.getMinute() == minute) {

                System.out.println("⏰ Alarm Ringing! Wake up!");
                break;
            }
        }

        scanner.close();
    }
}
