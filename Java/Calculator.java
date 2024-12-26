// Write a program that performs addition,Substraction,multiplication and division based on user input.Ask the user to input two numbers and an operator(+,*,/,-) and print the result.

import java.util.Scanner;

public class Calculator
{
   public static void main(String[] args) 
   {
     Scanner scanner=new Scanner(System.in);
     System.out.println("Enter first number: ");  
     int a=scanner.nextInt();

     System.out.println("Enter Second number: ");
     int b=scanner.nextInt();

     System.out.println("Enter an operator (+,-,*,/)");
     char operator=scanner.next().charAt(0);

     double result;
      
      switch (operator)
      
      {
        case '+':
         result=a+b;
         System.out.println("The result is: " +result);
         break;


      
      
         case '-':
         result=a-b;
         System.out.println("The result is: " +result);
         break;

      
      
         case '*':
         result=a*b;
         System.out.println("The result is: " +result);
         break;

      
      
         case '/':
         result=a/b;
         System.out.println("The result is: " +result);
         break;

         default:
                System.out.println("Invalid operator. Please enter +, -, *, or /.");
        }

      }



   }
