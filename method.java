import java.util.Scanner;

public class method {

    public static final String YELLOW_BOLD = "\033[1;33m";
    public static final String YELLOW_UNDERLINED = "\033[4;33m";
    public static final String RESET = "\033[0m";
    final static double PI = Math.PI; // Global constants ONLY
                                      // Don't write spaghetti code
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        hello();
        System.out.print("Enter your name: ");
        String userName = scanner.nextLine();
        greetUser(userName);
        scanner.close();
    }

    public static void hello() {
        System.out.println(" ");
        System.out.println("|~~~~~~  ~");
        System.out.println("|~ Hello, Method! ~|");
        System.out.println("|~~~~");
        System.out.println(" ");
    }

    public static void greetUser(String name) {
        System.out.println(" ");
        System.out.println("Hello, " + YELLOW_UNDERLINED + YELLOW_BOLD + name + RESET + "!");
        System.out.println(" ");
    }

}
