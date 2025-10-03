import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        System.out.println("~ Leap Year Identifier ~");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter year you'd like to check: ");
        int userYear = scanner.nextInt();       
        if (userYear < 1582) {
            System.err.println("~ Invalid Entry ~");
            System.err.println("The Gregorian calender was not adopted until 1582...");
            while (userYear < 1582) {
                System.out.print("Please enter a valid year: ");
                userYear = scanner.nextInt();
            }
        }
        if (userYear % 4 == 0) {
            if (userYear % 100 == 0 && userYear % 400 != 0 ) {
                System.out.println(userYear + " is not a leap year.");
            } else {
            System.out.println(userYear + " is a leap year!");
            }
        }
        if (userYear % 4 != 0) {
            System.out.println(userYear + " is not a leap year.");
        }
        scanner.close();
    }
}