//Write a program that calculates the sum of all odd numbers between 1 and 100 (inclusive) using a for loop.

public class SumOfOdd 
{
    public static void main(String[] args)
    {
    System.out.println("Sum of Odd numbers is: ");
    int sum=0;
      for(int i=0;i<=100;i++)
      {
        if((i%2)!=0)
        sum+=i;
       
      }
      System.out.println(sum);
    }
}
