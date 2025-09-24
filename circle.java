package projects;
import java.util.Scanner;

public class circle {
    public static void main(String[] args) {
        System.out.print("Please enter the radius of your circle: ");
        final Double PI = Math.PI; // final = const, usually capitalized + Math class
        Scanner scanner = new Scanner(System.in);
        Double radius = scanner.nextDouble();
        Double circumference = radius * PI * 2; 
        Double area = Math.pow(radius, 2) * PI;
        System.out.println("Radius = " + radius);
        System.out.println("Pi = " + PI);
        System.out.println("Circumference = " + circumference);
        System.out.println("Area = " + area);
        scanner.close();
    }
}