
//Write a program that prints all even numbers between 1 and n using a do-while loop.
import java.util.Scanner;

public class PrintEven 
{
    public static void main(String[] args)
    {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter the last number: ");
        int n=scanner.nextInt();
        System.out.println("List of even number between 1 and " +n);
        
        int i=1;
        do
        {
        if(i%2==0)
        System.out.println(i);
        i++;
        }
        while(i<n);
        scanner.close();
    }
}
