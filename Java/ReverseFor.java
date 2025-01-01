//Write a program to reverse a number using a for loop. 
import java.util.Scanner;

public class ReverseFor
{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the nUmber: ");
        int number=scanner.nextInt();
        int reverse=0;

        for(; number!=0;number/=10)
        {
            int digit=number%10;
            reverse=reverse*10+digit;
           
        }
          System.out.println("Reverse number is: " +reverse);
          scanner.close();
    }
}