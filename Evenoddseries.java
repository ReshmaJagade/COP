//11:Write a  program to find sum of all even and odd numbers between 1 to n. 
package myproj;

import java.util.Scanner;
public class Evenoddseries {
public static void main(String[] args)
	{
	 int N, i, sum = 0;
	 int sum1=0;
	 Scanner in = new Scanner(System.in);
     System.out.print("Enter a number:");
     N = in.nextInt();

     for(i = 0; i <= N; i++)
     {
         if((i%2) == 1)
         {
             sum += i;
         }
     }
   System.out.println("Sum of all odd numbers between 0 to "+ N + " = " + sum);
	for(i = 0; i <= N; i++)
{
    if((i%2) == 0)
    {
        sum1 += i;
    }
}

System.out.println("Sum of all even numbers between 0 to "+ N + " = " + sum1);
 

}

}
