/* Write a program that asks the user for a temperature and a conversion type (`C` for Celsius to Fahrenheit or `F` for Fahrenheit to Celsius), and then converts the temperature accordingly.

- **Celsius to Fahrenheit**: `(C * 9/5) + 32`
- **Fahrenheit to Celsius**: `(F - 32) * 5/9` */

import java.util.Scanner;

public class TemperatureConversion 
{
    public static void main(String[] args) 
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the temperature: ");
        double input=scanner.nextDouble();
        System.out.println("Enter the type for conversion (C/F)");
       char type=scanner.next().charAt(0);
        double result;

        if(type=='C')
        {
         result=(input-32)*5/9;
         System.out.println("Converted Celcius temperature is" +result);
        }
        else if(type=='F')
        {
        result=(input*9/5)+32;
        System.out.println("Converted farenheit temperature is" +result);
        }
        else
        {
        System.out.println("Enter the valid type for conversion");
        }
       




    }
}
