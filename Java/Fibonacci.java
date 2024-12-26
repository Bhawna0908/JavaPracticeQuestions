//write a program to print the 'n' numbers of the fibonacci Sequence Where the 'n' is inputted by the user.(sum of first two is third and so on)

import java.util.Scanner;

public class Fibonacci 
{
    public static void main(String[] args)
     {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number of terms: ");
        int n=scanner.nextInt();

        if(n<=0)
        {
            System.out.println("Please enter a positive integer. ");
        }
        else if(n==1)
        {
            System.out.println("Fibonacci series: 0,1 ");
        }
        else if(n==2)
        {
            System.out.println("Fibonacci series: 0,1,1");
        }
        else
        {
            System.out.println("Fibonacci series: 0,1 ");
            int first=0, second=1;
            for(int i=3; i<=n;i++)
            {
                int next=first+second;
                System.out.print( " , " + next);
                first=second;
                second=next;
            }
            System.out.println();
        

    }
}
}