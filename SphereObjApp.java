import java.util.Scanner;

public class SphereObjApp {
    public static void main(String[] args) {
        double radius, surfaceArea, volume;
        radius = userInput();
        SphereObj sO = new SphereObj(radius);
        surfaceArea = sO.surfaceArea();
        volume = sO.volume();
        displayResults(radius, surfaceArea, volume);
    }

    public static double userInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the radius of the sphere you would like to calculate: ");
        double r = scanner.nextDouble();
        scanner.close();
        System.out.println("");
        return r;
    }

    public static void displayResults(double r, double s, double v) {
        System.out.println("Radius: " + r);
        System.out.println("Surface Area: " + s);
        System.out.println("Volume: " + v);
    }
}