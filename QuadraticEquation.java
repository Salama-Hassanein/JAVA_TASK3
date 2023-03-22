import java.util.Scanner;
import java.util.function.BiFunction;
import java.util.function.Function;

public class QuadraticEquation {

  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      // Read the coefficients of the quadratic equation from the user
      System.out.print("Enter the coefficient a: ");
      double a = scanner.nextDouble();
      System.out.print("Enter the coefficient b: ");
      double b = scanner.nextDouble();
      System.out.print("Enter the coefficient c: ");
      double c = scanner.nextDouble();

      // Define the discriminant function using a BiFunction object
      BiFunction<Double, Double, Double> discriminantFunction = (
          coefficientB,
          coefficientA
        ) ->
        (coefficientB * coefficientB) - (4 * coefficientA * c);

      // Define the roots function using a Function object
      Function<BiFunction<Double, Double, Double>, Double[]> rootsFunction = discriminantFunc -> {
        double discriminant = discriminantFunc.apply(b, a);
        if (discriminant < 0) {
          return new Double[0]; // Return an empty array if there are no real roots
        } else if (discriminant == 0) {
          double root = -b / (2 * a);
          return new Double[] { root };
        } else {
          double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
          double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
          return new Double[] { root1, root2 };
        }
      };

      // Calculate the roots using the roots function
      Double[] roots = rootsFunction.apply(discriminantFunction);

      // Print the roots
      if (roots.length == 0) {
        System.out.println("The quadratic equation has no real roots.");
      } else if (roots.length == 1) {
        System.out.println(
          "The quadratic equation has one real root: " + roots[0]
        );
      } else {
        System.out.println(
          "The quadratic equation has two real roots: " +
          roots[0] +
          " and " +
          roots[1]
        );
      }
    }
  }
}
/*
In this example, we use a BiFunction<Double, Double, Double> object called discriminantFunction 
to calculate the discriminant of the quadratic equation 
using the formula b^2 - 4ac. We then define a Function<BiFunction<Double, Double, Double>, Double[]> 
object called rootsFunction that takes the discriminantFunction as a parameter 
and returns an array of the real roots of the quadratic equation. 
The rootsFunction uses the discriminant to determine whether there are no real roots, one real root, or two
real roots, and returns an array containing the roots.

We read the coefficients of the quadratic equation from the user, and then use the rootsFunction 
to calculate the roots. Finally, we print the roots to the console.
 */
