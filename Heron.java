import java.util.Scanner;

public class Heron {
    public static void main(String[] args) {
        System.out.println("~ Heron's Formula ~");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the length of each side.");
        System.out.print("a: ");
        double a = scanner.nextDouble();
        System.out.print("b: ");
        double b = scanner.nextDouble();
        System.out.print("c: ");
        double c = scanner.nextDouble();
        double s = (a + b + c) / 2; 
        double area = Math.sqrt( (s * (s - a) * (s - b) * (s - c)));
        System.out.println("Area: " + String.format("%.3f", area));
        scanner.close();
    }
}
