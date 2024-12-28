//Write a program that prints all numbers between 1 and 50 that are divisible by 5 using a while loop.

public class PrintNumber
{
  public static void main(String[] args)
   {
      
     int i=1;
     System.out.println("Numbers divisible by 5 are: ");
     while(i<=50)
     {
        if((i%5)==0)
        System.out.println(i);
        i++;
     }
  }    
}
