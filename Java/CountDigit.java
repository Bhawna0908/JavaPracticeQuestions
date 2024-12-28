//Write a program to count the number of digits in a given integer using a `while` loop.

import java.util.Scanner;

public class CountDigit 
{
    public static void main(String[] args)
    {
     Scanner scanner=new Scanner(System.in)  ;
     System.out.println("Enter the Number");
     int number=scanner.nextInt();
     int count=0;

     if(number==0)
     {
     count++;
     }
     else{
         while(number>0)
         {
         number=number/10;
         count++;
         }
        }
    System.out.println("The number of digits are: " +count);
    scanner.close();
         
}
}