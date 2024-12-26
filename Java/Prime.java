import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input from user
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Check for prime
        if (number <= 1) {
            System.out.println(number + " is not a prime number.");
        } else if (number == 2) {
            System.out.println(number + " is a prime number."); // 2 is prime
        } else if (number % 2 == 0) {
            System.out.println(number + " is not a prime number."); // All other even numbers
        } else {
            boolean isPrime = true;
            // Check divisors only for odd numbers up to number / 2
            for (int i = 3; i <= number / 2; i += 2) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            // Output result
            if (isPrime) {
                System.out.println(number + " is a prime number.");
            } else {
                System.out.println(number + " is not a prime number.");
            }
        }

        scanner.close();
    }
}
