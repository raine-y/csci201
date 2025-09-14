import java.util.Scanner;

public class seconds {
    public static void main(String[] args) {
        System.out.println("Time Duration in Seconds!!!");
        System.out.println("~");
        System.out.println("[Format your entry as: 00:00:00]");
        System.out.println("[As hours, minutes and seconds ]");
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
        System.out.println(hours + ":" + minutes + ":" + seconds + " = " + timeSeconds + " seconds");
        scanner.close();
    }
}
