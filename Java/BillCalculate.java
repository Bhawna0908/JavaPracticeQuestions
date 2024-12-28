/* Create a program that calculates the electricity bill based on the following criteria:

- For the first 100 units, the rate is 1.50 per unit.
- For the next 200 units, the rate is 2.00 per unit.
- For units above 300, the rate is 3.00 per unit.

The program should take the number of units consumed as input and use conditional statements to calculate the total bill. */

import java.util.Scanner;

public class BillCalculate 
{
    public static void main(String[] args)
     {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the units: ");
        double units=scanner.nextDouble();              // for double data
        double total;

        if(units<=100)
        {
            System.out.println("Total bill for the units is: " +units*1.50);
        }
        else if((units>100) && (units<=300))
        {
           total=(100*1.50)+((units-100)*2.00);
            System.out.println("Total bill for the units is: " +total);
        }
        else if((units>300))
        {
            total=(100*1.50)+(200*2.00)+((units-300)*3.00);
            System.out.println("Total bill for the units is: " +total);
        }
        else
        {
            System.out.println("Enter the valid number of units to calculate");
        }
        scanner.close();
        }
        
    }

