//Write a program to reverse a number using a do-while loop.
import java.util.Scanner;

public class ReverseDoWhile
{
 public static void main(String[] args)
{
    Scanner scanner=new Scanner(System.in);
    System.out.println("Enter the Number: ");
    int number=scanner.nextInt();
    int digit;
    int reverse=0;

    do
    {
       digit=number%10; 
       reverse=reverse*10+digit;
       number=number/10;
    
    }
    while(number!=0);
    System.out.println("The reverse number is: " +reverse);
 }   
}
