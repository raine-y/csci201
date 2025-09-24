package projects;

import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class lottery {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        // for (int i = 0; i < 3; i++){
        // }
        System.out.println("Please enter your lottery numbers, as such: '1,2,3',");
        System.out.println("to see if you have wom the lottery!!!");
        System.out.print("Enter #s here: ");
        String playerNumbers = scanner.nextLine();
        System.out.println("~");
        String regex = "[,\\,\\,]";
        String[] playerArray = playerNumbers.split(regex);
        int player1 = Integer.parseInt(playerArray[0]);
        int player2 = Integer.parseInt(playerArray[1]);
        int player3 = Integer.parseInt(playerArray[2]);
        int[] lottoStream = random.ints(3, 1, 25).toArray();
        System.out.println("The winning lottery numbers are: " + Arrays.toString(lottoStream));
        System.out.println("*     Your lottery numbers were: " + Arrays.toString(playerArray));
        if ( lottoStream[0] == player1) {
            if ( lottoStream[1] == player2) {
                if ( lottoStream[2] == player3) {
                    System.out.println("YOU WON!!!");
                    System.out.println("Thanks for playing!");
                } else { 
                System.out.println("Sorry.. you lost...");
                System.out.println("On the final number...");
                System.out.println("That's rough..");
                System.out.println("Thanks for playing!");
                }
            } else {
            System.out.println("Sorry.. you lost...");
            System.out.println("On the second number.");
            System.out.println("Thanks for playing!");
            }
        } else {
        System.out.println("Sorry.. you lost...");
        System.out.println("On the first number.");
        System.out.println("Thanks for playing!");
        scanner.close();
        }
    }
}