//Write a program to print the multiplication table of a number (1 through 10) using a while loop.
import java.util.Scanner;
public class Table 
{
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the number for the table: ");
        int number=scanner.nextInt();
        int i=1;
        int table;
        
        while(i<=10)
        {
           table=number*i; 
           System.out.println(number + " * " +i  + " = " +table);
           //System.out.println(number " * " +i " = " +table);
           i++;
        }
        scanner.close();
    }
}
