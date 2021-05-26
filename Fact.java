//6:Write a program to find factorial of a given number.
package myproj;

import java.util.Scanner;

public class Fact {

	public static void main(String[] args)
	{
		int fact=1;  
		  int number;
		  Scanner sc=new Scanner(System.in);
		  System.out.print("Enter number:");
		  number=sc.nextInt();
		  
		  for(int i=1;i<=number;i++)
		  {    
		      fact=fact*i;    
		  }    
		  System.out.println("Factorial of "+number+" is: "+fact);    
		  sc.close();
		 }  

	}

