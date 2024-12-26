//Write a program that calculates the sum of all multiples of 3 or 5 below a given number 'n'
import java.util.Scanner;

public class SumOfMultiples 
{
    public static void main(String[] args)
     {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();

        int sum = 0;

        // Iterate through all numbers below n
        for (int i = 1; i < n; i++) {
            // Check if the number is a multiple of 3 or 5
            if (i % 3 == 0 || i % 5 == 0) {
                sum += i; // Add to the sum
            }
        }

        // Output the result
        System.out.println("The sum of all multiples of 3 or 5 below " + n + " is: " + sum);

        

     }
    }