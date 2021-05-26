//3:Find the compound amount and compound interest on the principal Rs.20,000
//borrowed at 6% compounded annually for 3 years.

package myproj;

import java.util.Scanner;

public class Compoundinterest 
{
	public static void main(String[] args) 
	{
		
	Scanner input=new Scanner(System.in);
	System.out.print("Enter Principal:");
    double principal = input.nextDouble();

    System.out.print("Enter the rate: ");
    double rate = input.nextDouble();

    System.out.print("Enter the time: ");
    double time = input.nextDouble();
    
    System.out.print("Enter number of times interest is compounded: ");
    int number = input.nextInt();

   double interest = principal * (Math.pow((1 + rate/100), (time * number))) - principal;

    System.out.println("Principal: " + principal);
    System.out.println("Interest Rate: " + rate);
    System.out.println("Time Duration: " + time);
    System.out.println("Number of Time interest Compounded: " + number);
    System.out.println("Compound Interest: " + interest);

    input.close();
  }
}