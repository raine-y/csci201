import java.util.Scanner;

public class sphere {
    public static void main(String[] args){
        final Double PI = Math.PI;
        System.out.print("Enter the radius of your sphere: ");
        Scanner scanner = new Scanner(System.in);
        Double radius = scanner.nextDouble();
        Double surfaceArea = 4.0 * PI * Math.pow(radius, 2);
        Double volume = (4.0 / 3.0) * PI * Math.pow(radius, 3);
        System.out.println("Radius = " + radius);
        System.out.println("Pi = " + PI);
        System.out.println("Surface Area = " + surfaceArea);
        System.out.println("Volume = " + volume);
        scanner.close();
    }
}