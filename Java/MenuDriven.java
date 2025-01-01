/*Write a menu-driven program that asks the user to select an option from the following choices:
Add two numbers
Subtract two numbers
Exit
Use a `do-while` loop to repeatedly show the menu until the user chooses to exit.
public class MenuDriven */
    

import java.util.Scanner;

public class MenuDriven
{
    public static void main(String[] args)
    {
     Scanner scanner=new Scanner(System.in);
     char input;

     do
     {
        System.out.println("Enter your Options: ");
        System.out.println("1. A For add two numbers");
        System.out.println("2. S For Subtract two numbers");
        System.out.println("3. E for Exit ");
        System.out.println("Enter your Choice: ");
        input=scanner.next().toUpperCase().charAt(0);

        switch(input)
        {
        case 'A':
        System.out.println("Enter the first number: ");
        int num1=scanner.nextInt();
        System.out.println("Enter the Second Number: ");
        int num2=scanner.nextInt();
        System.out.println("Sum of two numbers is: " +(num1+num2));
        break;

        case 'S':
        System.out.println("Enter the first number: ");
        int num3=scanner.nextInt();
        System.out.println("Enter the Second Number: ");
        int num4=scanner.nextInt();
        System.out.println("Difference of two numbers is: " +(num3-num4));
        break;

        case 'E':
        System.out.println("Exiting the program, bye.");
        break;

        default:
        System.out.println("Invalid input,Please try again");
        }
  
     }
     while(input!='E');
     scanner.close();
    }
}