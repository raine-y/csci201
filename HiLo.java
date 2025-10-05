import java.util.Random;
import java.util.Scanner;

public class HiLo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        boolean stillPlaying = true;
        String con = "x";
        System.out.println("|~~~~~~~~~~~~~~~~~~~~~~~~~~~|");
        System.out.println("|~ Random Number Generator ~|");
        System.out.println("|~ * And Guesser...        ~|");
        System.out.println("|~~~~~~~~~~~~~~~~~~~~~~~~~~~|");
        System.out.println("");
        System.out.println("|~ Hint: The value is between 0 and 101");
        System.out.println("");
        int randNum = random.nextInt(100 + 1 - 1) + 1;
        while (stillPlaying == true) {
            System.out.print("Enter your guess: ");
            int randGuess = scanner.nextInt();
            scanner.nextLine(); // clear scanner mem..? buffer..? eat..? eat/
                                // definitely eat
                                // ...
            System.out.println("");
            if (randNum != randGuess) {
                System.out.println("|~ WRONG!!!");
                System.out.println("|~ HAHAHA");
                if (randGuess > randNum) {
                    System.out.println("|~ TOO HIGH XD");
                    System.out.println("|~ ...");
                    System.out.println("|~ Try again :3");
                    System.out.println("");
                } if (randGuess < randNum) {
                    System.out.println("|~ TOO LOW!");
                    System.out.println("|~ Try again :p");
                    System.out.println("");
                }
            } else {
                System.out.println("|~ WRO. ,,");
                System.out.println("|~ .......");
                System.out.println("|~ that's actually right.");
                System.out.println("|~ ");
                System.out.println("|~ I'll get you next time :|");
                System.out.println("|~ would you like to try again?");    
                System.out.println("|~ Hint: enter 'c' to continue and 'q to quit");
                System.out.println();
                System.out.print("Keep playing?: ");
                boolean deciding = true;
                while (deciding == true) {
                    con = scanner.nextLine();
                    switch (con) {
                        case "c":
                            System.out.println("Starting new game...");
                            System.out.println();
                            deciding = false;
                            break;
                        case "q":
                            System.out.println("Exiting application.");
                            System.exit(0);
                        default:
                            System.out.println("Invalid choice. Please enter c or q");
                            System.out.println("");
                            System.out.print("Keep playing?: ");
                    }
                } 
            }
        } 
        scanner.close(); 
    }
}