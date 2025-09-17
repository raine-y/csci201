import java.util.Scanner;

public class sphere {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String YELLOW_UNDERLINED = "\033[4;33m";
    public static void main(String[] args){
        final Double PI = Math.PI;
        System.out.print("Enter the radius of your sphere: ");
        Scanner scanner = new Scanner(System.in);
        Double radius = scanner.nextDouble();
        Double surfaceArea = 4.0 * PI * Math.pow(radius, 2);
        Double volume = (4.0 / 3.0) * PI * Math.pow(radius, 3);
        System.out.println("Radius = " + radius);
        System.out.println("Pi = " + PI);
        System.out.println("Surface Area = " + YELLOW_UNDERLINED + surfaceArea + ANSI_RESET);
        System.out.println("Volume = " + YELLOW_UNDERLINED +  volume + ANSI_RESET);
        scanner.close();
    }
}