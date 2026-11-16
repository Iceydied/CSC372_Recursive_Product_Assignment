import java.util.Scanner;

public class RecursiveProduct {

    // Recursively multiply the numbers in the array.
    public static double calculateProduct(double[] numbers, int index) {
        // Base case: no numbers left to multiply.
        if (index == numbers.length) {
            return 1.0;
        }

        // Recursive case: current number times the remaining numbers.
        return numbers[index] * calculateProduct(numbers, index + 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] numbers = new double[5];

        System.out.println("Recursive Product Calculator");
        System.out.println("Enter five numbers to multiply.");

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");

            // Keep asking if the user enters something other than a number.
            while (!scanner.hasNextDouble()) {
                System.out.println("Invalid input. Please enter a number.");
                scanner.next();
                System.out.print("Enter number " + (i + 1) + ": ");
            }

            numbers[i] = scanner.nextDouble();
        }

        double product = calculateProduct(numbers, 0);
        System.out.printf("Product of the five numbers: %.2f%n", product);

        scanner.close();
    }
}
