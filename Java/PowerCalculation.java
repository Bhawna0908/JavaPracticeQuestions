//Write a program that calculates the power of a number using a do-while loop. The program should ask for a base number and an exponent and then compute the result by multiplying the base repeatedly.

import java.util.Scanner;

public class PowerCalculation 
{
  public static void main(String[] args)
  {
    Scanner scanner=new Scanner(System.in);
    System.out.println("Enter the base: ");
    int base=scanner.nextInt();
    System.out.println("Enter the power: ");
    int power=scanner.nextInt();
    int result=1;
    int count=0;
    
    do
    {
       result*=base;
       count++;
     }
     while(count<power);
     System.out.println(base +" with power " +power +" is: " +result);
  }
    
}
