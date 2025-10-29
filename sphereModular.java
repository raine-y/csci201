import java.util.Scanner;

public class sphereModular {

    public static final String RESET = "\033[0m"; // Terminal colors for readability
    public static final String RED = "\033[0;31m";
    public static final String GREEN = "\033[0;32m";
    public static final String BLUE = "\033[0;34m";
    public static final String RED_UNDERLINED = "\033[4;31m";
    public static final String GREEN_UNDERLINED = "\033[4;32m";
    public static final String BLUE_UNDERLINED = "\033[4;34m";
    public static final String WHITE_UNDERLINED = "\033[4;37m";

    final static double PI = Math.PI;

    public static void main(String[] args) {
        System.out.println("|~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~|");
        System.out.println("|~    + SPHERE CALCULATOR +   ~|");
        System.out.println("|~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~|");
        System.out.println("");
        double radius = userInput();
        double surfaceArea = surfaceArea(radius);
        double volume = volume(radius);
        displayResults(radius, surfaceArea, volume);
    }

    public static double userInput() { // 1. Input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the radius of the sphere you would like to calculate: ");
        double r = scanner.nextDouble();
        scanner.close();
        System.out.println("");
        return r;
    }

    public static double surfaceArea(double r) { // 2. Surface Area
        double s = 4.0 * PI * Math.pow(r, 2);
        return s;
    }

    public static double volume(double r) { // 3. Volume
        double v = (4.0 / 3.0) * PI * Math.pow(r, 3);
        return v;
    }
    public static void displayResults(double r, double s, double v) { // 4. Results
        System.out.println("|~ " + WHITE_UNDERLINED + "Radius" + RESET + ": " + r);
        System.out.println("|~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*");
        System.out.println("|~ " + RED_UNDERLINED + "Pi" + RESET + ": " + RED + PI + RESET);
        System.out.println("|~ " + GREEN_UNDERLINED + "Surface Area" + RESET + ": " + GREEN + s + RESET);
        System.out.println("|~ " + BLUE_UNDERLINED + "Volume" + RESET + ": " + BLUE + v + RESET);
        System.out.println("|~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*");
    }
}
