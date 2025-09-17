import java.util.Scanner;

public class average {
    public static void main(String[] args) {
        System.out.println("Please enter the three integers you would like to find the average of -");
        System.out.print("1: ");
        Scanner scanner = new Scanner(System.in);
        int int1 = scanner.nextInt();
        System.out.print("2: ");
        int int2 = scanner.nextInt();
        System.out.print("3: ");
        int int3 = scanner.nextInt();
        double dbl1 = int1;
        double dbl2 = int2;
        double dbl3 = int3;
        double average = (dbl1 + dbl2 + dbl3) / 3;
        System.out.println("The average of " + int1 + ", " + int2 + " and " + int3 + " is: " + average);
        scanner.close();
    }
}