//Write a program that calculates the sum of digits of a number using a while loop.
import java.util.Scanner;
public class TotalSumWithWhile
{
    public static void main(String[] args)
    {
       Scanner scanner=new Scanner(System.in);
       System.out.println("Enter the number: "); 
       int number=scanner.nextInt();
       int sum=0;

       while(number!=0)
       {
        int digit=number%10;
        sum+=digit;
        number=number/10;

       }
       System.out.println("sum of digits are " +sum);
    }
}
