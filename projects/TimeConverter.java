package projects;
import java.util.Scanner;

public class TimeConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the # of seconds you would like to convert: ");
        int userSeconds = scanner.nextInt();
        double hours = Math.floor(userSeconds / 3600.0);
        int hoursInt = (int) hours;
        int hoursRemainder = userSeconds % 3600;
        double minutes = Math.floor(hoursRemainder / 60.0);
        int minutesInt = (int) minutes;
        int minutesRemainder = userSeconds % 60;
        System.out.println("~");
        System.out.println(userSeconds + " is equal to: " + hoursInt + " hour(s), " + minutesInt + " minute(s) and " + minutesRemainder + " second(s).");
        scanner.close();
    }
}