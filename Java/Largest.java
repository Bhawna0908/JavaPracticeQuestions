//Write a program that finds and prints the largest prime factor of a given number
import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input from the user
        
        long number = scanner.nextLong();

        // Find the largest prime factor
        long largestFactor = largestPrimeFactor(number);

        // Print the result
        System.out.println("The largest prime factor of " + number + " is: " + largestFactor);

        scanner.close();
    }

    // Simplified method to find the largest prime factor
    public static long largestPrimeFactor(long number) {
        long largestFactor = -1;

        // Divide out all factors of 2
        while (number % 2 == 0) {
            largestFactor = 2;
            number /= 2;
        }

        // Check for odd factors starting from 3
        for (long i = 3; i <= number; i += 2) {
            while (number % i == 0) {
                largestFactor = i;
                number /= i;
            }
        }

        return largestFactor;
    }
}
