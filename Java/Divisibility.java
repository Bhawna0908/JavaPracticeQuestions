// Write a program to check the number is divisible by both 3 and 5 and prints a message accordingly

import java.util.Scanner;

public class Divisibility
{
  public static void main(String[] args) 
  {
      Scanner scanner=new Scanner(System.in);
      System.out.println("Enter the number: ");
      int input=scanner.nextInt();

      if((input%3==0) && (input%5==0))
      {
        System.out.println("Number is divisible by 3 and 5.");
      }
      else
      {
        System.out.println("Number is not divisible by 3 and 5.");
      }

  }













}