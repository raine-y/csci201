import java.util.Scanner;

public class method {

    final static double PI = Math.PI;

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
        System.out.println("Hello, " + name + "!");
        System.out.println(" ");
        System.out.println("Did you know that the value of PI is approximately " + PI + "?");
    }

}
