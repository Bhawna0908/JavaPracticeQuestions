//Ask the user to enter a number and calculate its sum

import java.util.Scanner;

public class SumOfDigit
{
  public static void main(String[] args)
   {
      Scanner scanner=new Scanner(System.in);
      System.out.println("Enter the number: ");
      int input=scanner.nextInt();

      int sum = 0;
      int originalNumber = input; // To display the original input later

      // Calculate the sum of digits
      while (input != 0) {
          int digit =input % 10; // Extract the last digit
          sum += digit;           // Add the digit to the sum
          input = input / 10;   // Remove the last digit
      }

      // Print the result
      System.out.println("The sum of the digits of " + originalNumber + " is: " + sum);
      }
  }
