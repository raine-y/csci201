import java.util.Scanner;

public class TempConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter temperature in fahrenheit to convert to celsius: ");
        double fahrenheitTemp = scanner.nextDouble();
        double celsiusTemp = (fahrenheitTemp - 32) / 1.8;
        System.out.println("Fahrenheit Temperature: " + fahrenheitTemp);
        System.out.println("Celsius Equivalent: " + String.format("%.1f", celsiusTemp));
        scanner.close();
    }
}