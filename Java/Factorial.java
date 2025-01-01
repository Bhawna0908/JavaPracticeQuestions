//Write a program that calculates the factorial of a number using a for loop. The factorial of a number n is the product of all positive integers less than or equal to n (i.e., n! = n * (n-1) * ... * 1).
import java.util.Scanner;

public class Factorial 
{
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number=scanner.nextInt();
        int Factorial=1;
        
        for(int i=1;i<=number;i++)
        {
           Factorial*=i;
        }
        System.out.println("Factorial of the number" +number +" is: " +Factorial );
    }
}
