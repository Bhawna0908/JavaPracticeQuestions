/*Write a program that takes an Integer or a String (representing a month of the year) as input and prints the corresponding season:

- December, January, February → Winter
- March, April, May → Spring
- June, July, August → Summer
- September, October, November → Autumn */


import java.util.Scanner;

public class MonthToSeason 
{
    public static void main(String[] args)
    { 
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the month or month's number");
        String month=scanner.nextLine();
        String season;
    

        switch(month)
        {
        case "1": case "January":
        case "2": case "February":
        case "12": case "December":
        season="Winter";
        break;

        case "3": case "March":
        case "4": case "April":
        case "5": case "May":
        season="Spring";
        break;
        
        case "6": case "June":
        case "7": case "July":
        case "8": case "August":
        season="Summer";
        break;

        case "9": case "September":
        case "10": case "October":
        case "11": case "November":
        season="Autumn";
        break;
        
        default:
        season="Invalid month or number.";
        }
        System.out.println("The season is: " +season);
       scanner.close();
        
        
   
    }
}