import java.util.Scanner;

public class circle {
    public static void main(String[] args) {
        System.out.print("Please enter the radius of your circle: ");
        Scanner scanner = new Scanner(System.in);
        Double radius = scanner.nextDouble();
        Double circumference = radius * 3.14 * 2; 
        Double area = radius * radius * 3.14;
        System.out.println("Radius = " + radius);
        System.out.println("Circumference = " + circumference);
        System.out.println("Area = " + area);
        scanner.close();
    }
}