//Implement a program to find the Greatest Common Divisor (GCD) and Least Common Multiple (LCM) of two numbers using loops and conditional statements.

import java.util.Scanner;

public class LcmAndHcf 
{
    public static void main(String[] args) 
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int number=scanner.nextInt();
        System.out.println("Enter the Second number: ");
        int number2=scanner.nextInt();

       int gcd=1;
       int lcm;

       for(int i=1;i<=number&& i<=number2;i++)
       {
        if(number%i==0 && number2%i==0)
        gcd=i;
       }
       lcm=(number*number2)/gcd;
       System.out.println("LCM and HCF of the two numbers" +number + " and " +number2 + " is: " +lcm + " " +gcd);
       scanner.close();

    }
}
