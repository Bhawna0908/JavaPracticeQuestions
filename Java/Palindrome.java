import java.util.Scanner;  //imports Scanner class from java utility library, to take input from user

public class Palindrome{
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter a String: ");
        String input=scanner.nextLine();
        String reversed=new StringBuilder(input).reverse().toString();
     // Creates StringBuilder object initialized with the user's input
        if(input.equals(reversed))
        {
            System.out.println("String is a Palindrome.");
        }
        else
        {
            System.out.println("String is not a Palindrome");
        }
        scanner.close();   //Closes the Scanner object to free system resources
        }
    }
