import java.util.Scanner; // <-- OBJECT MENTIONED

public class ioMath {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // class capital, variable and method lower case
        System.out.println("Welcome to MATH");
        System.out.print("Enter your first value: "); // print keeps it on current line :0
        int num1 = scanner.nextInt();
        System.out.print("And enter your second value: ");
        int num2 = scanner.nextInt();
        scanner.close();
        int sum = num1 + num2;
        System.out.println("Your total is: " + sum + "!");
    }
}