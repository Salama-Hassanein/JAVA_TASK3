import java.util.Scanner;

public class QuadraticEquationNew {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            // Read the coefficients of the quadratic equation from the user
            System.out.print("Enter the coefficient a: ");
            double a = scanner.nextDouble();
            System.out.print("Enter the coefficient b: ");
            double b = scanner.nextDouble();
            System.out.print("Enter the coefficient c: ");
            double c = scanner.nextDouble();

            // Calculate the discriminant
            double discriminant = (b * b) - (4 * a * c);

            // Calculate the roots
            double[] roots;
            if (discriminant < 0) {
                roots = new double[0]; // Return an empty array if there are no real roots
            } else if (discriminant == 0) {
                double root = -b / (2 * a);
                roots = new double[] { root };
            } else {
                double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
                double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
                roots = new double[] { root1, root2 };
            }

            // Print the roots
            switch (roots.length) {
                case 0:
                    System.out.println("The quadratic equation has no real roots.");
                    break;
                case 1:
                    System.out.printf("The quadratic equation has one real root: %.2f%n", roots[0]);
                    break;
                case 2:
                    System.out.printf("The quadratic equation has two real roots: %.2f and %.2f%n", roots[0], roots[1]);
                    break;
            }
        }
    }
}
