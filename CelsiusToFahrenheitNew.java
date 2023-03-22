import java.util.Scanner;

public class CelsiusToFahrenheitNew {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 

        // Read a temperature in Celsius from the user
        System.out.print("Enter a temperature in Celsius: ");
        double celsius = scanner.nextDouble();

        // Convert Celsius to Fahrenheit
        double fahrenheit = (celsius * 1.8) + 32;

        // Print the result
        System.out.printf("%.2f degrees Celsius is %.2f degrees Fahrenheit.\n", celsius, fahrenheit);
    }
}
