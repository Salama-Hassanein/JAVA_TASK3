import java.util.Scanner;
import java.util.function.Function;

public class CelsiusToFahrenheit {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in); 
      // Create a Function object that converts Celsius to Fahrenheit
      Function<Double, Double> celsiusToFahrenheit = celsius ->
        (celsius * 1.8) + 32;

      // Read a temperature in Celsius from the user
      System.out.print("Enter a temperature in Celsius: ");
      double celsius = scanner.nextDouble();

      // Convert the temperature to Fahrenheit using the Function object
      double fahrenheit = celsiusToFahrenheit.apply(celsius);

      // Print the result
      System.out.println(
        celsius + " degrees Celsius is " + fahrenheit + " degrees Fahrenheit."
      );
    }
  }

/* 

// In this example, we use a lambda expression to define a Function<Double, Double> object 
called celsiusToFahrenheit. The lambda expression takes a double value representing a temperature 
in Celsius and returns a double value representing the temperature in Fahrenheit.

// We then read a temperature in Celsius from the user using a Scanner object, 
and apply the celsiusToFahrenheit function to convert it to Fahrenheit. 
Finally, we print out the result using System.out.println().
*/
