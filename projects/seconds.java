package projects;
import java.util.Scanner;

public class seconds {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String YELLOW_UNDERLINED = "\033[4;33m";
    public static void main(String[] args) {
        System.out.println("Time Duration in Seconds!!!");
        System.out.println("~");
        System.out.println("[Format your entry as: " + YELLOW_UNDERLINED + "00:00:00" + ANSI_RESET + "]");
        System.out.println("[----hours:minutes:seconds-----]");
        System.out.println("~");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Time to convert: ");
        String fullTime = scanner.nextLine();
        System.out.println("~");
        String regex = "[:\\:\\:]";
        String[] timeArray = fullTime.split(regex);
        int hours = Integer.parseInt(timeArray[0]);
        int minutes = Integer.parseInt(timeArray[1]);
        int seconds = Integer.parseInt(timeArray[2]);
        int timeSeconds = (hours * 3600) + (minutes * 60) + seconds;
        System.out.println(hours + ":" + minutes + ":" + seconds + " = " + YELLOW_UNDERLINED + timeSeconds + ANSI_RESET + " seconds");
        scanner.close();
    }
}
