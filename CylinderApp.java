import java.util.Scanner;

public class CylinderApp {
    public static void main(String[] args) {
        double radius, height, surfaceArea, volume;
        radius = userRadius();
        height = userHight();
        Cylinder cylinder = new Cylinder(radius, height);
        surfaceArea = cylinder.surfaceArea();
        volume = cylinder.volume();
        displayResults(radius, height, surfaceArea, volume);
    }

    public static double userRadius() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the radius of the cylinder you would like to calculate: ");
        double r = scanner.nextDouble();
        return r;
    }

    public static double userHight() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the height of the cylinder you would like to calculate: ");
        double h = scanner.nextDouble();
        System.out.println("");
        scanner.close();
        return h;
    }

    public static void displayResults(double r, double h, double s, double v) {
        System.out.println("Radius: " + r);
        System.out.println("Height: " + h);
        System.out.println("Surface Area: " + s);
        System.out.println("Volume: " + v);

    }
}