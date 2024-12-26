//Write a program that checks if a number is within a given range.If a number is within a given range, then print" In Range" otherwise "Out of Range"

import java.util.Scanner;

public class NumberRange
{
    public static void main(String[] args)
     {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter your Number: ");
        int input=scanner.nextInt();

        if((input>=0) && (input<=50))
        {
            System.out.println("Number is in Range. ");
        }
        else
        {
            System.out.println("Number is not in Range");
        }

     }
}