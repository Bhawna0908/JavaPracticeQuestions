//Write a program that asks the user to input numbers until they enter 0. The program should sum all the numbers entered using a do-while loop and print the final sum.
import java.util.Scanner;
public class SumUntilZero
{
    public static void main(String[] args)
    {
       Scanner scanner=new Scanner(System.in);
       int sum=0;
       int input;
       do 
       { 
         System.out.println("Enter the number to add: ");
         input=scanner.nextInt();
         sum +=  input;
         
       } while (input!=0);
       System.out.println("sum of all numbers are: " +sum);
    }
}