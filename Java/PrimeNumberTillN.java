//Write a program that prints all prime numbers between 1 and n using a for loop. A prime number is a number that is only divisible by 1 and itself.
import java.util.Scanner;

public class PrimeNumberTillN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input range
        System.out.println("Enter the last number from the range (starting with 1): ");
        int n = scanner.nextInt();

        if (n < 2) {
            System.out.println("There are no prime numbers in this range.");
        } else {
            System.out.println("Prime numbers between 1 and " + n + " are:");
            for (int num = 2; num <= n; num++) { // Loop through all numbers from 2 to n
                int count = 0; // Reset count for each number

                for (int i = 2; i <= num / 2; i++) { // Check divisors
                    if (num % i == 0) {
                        count++;
                        break; // Exit early if a divisor is found
                    }
                }

                if (count == 0) { // If no divisors were found, it's a prime number
                    System.out.print(num + " ");
                }
            }
        }
        scanner.close();
    }
}
