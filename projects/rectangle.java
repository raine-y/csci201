import java.util.Scanner;

public class rectangle {

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String YELLOW_UNDERLINED = "\033[4;33m";
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        System.out.println(".-------------------------------------------------.");
        System.out.println("| Hello, let's calculate the area of a rectangle! |");
        System.out.println("|_________________________________________________|");
        System.out.println();
        System.out.print("First, enter the height: ");
        double height = scanner.nextDouble();
        System.out.print("Now, enter the width: ");
        double width = scanner.nextDouble();
        double area = width * height;
        System.out.println("The area of a(n) " + height + " by " + width + " rectangle is: " + YELLOW_UNDERLINED + area + ANSI_RESET + "!");
        scanner.close();
    }
} 