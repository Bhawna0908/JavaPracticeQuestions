import java.util.Scanner;

public class Leap
{
   public static void main(String[] args) 
    {
       int r;
       Scanner scanner=new Scanner(System.in);
       System.out.println("Enter the year: ");
       int input=scanner.nextInt();
       r=input%2;
       
       if(r==0)
       {
        System.out.println("Year is a Leap year.");
       }
       else
       {
        System.out.println("Year is not a Leap year. ");
       }
       scanner.close();
    }
}