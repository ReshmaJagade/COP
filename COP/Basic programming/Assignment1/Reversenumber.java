package myproj;

import java.util.Scanner;

public class Reversenumber {

	public static void main(String[] args)
	{
		int N,reverse = 0; 
		 Scanner in = new Scanner(System.in);
	     System.out.print("Enter a number:");
	     N = in.nextInt();
	      
	     while(N != 0)   
	     {  
	     int remainder = N % 10; 
	     //System.out.println("number1 is: " + remainder); 
	     reverse = reverse * 10 + remainder; 
	     //System.out.println("number2 is: " + reverse); 
	     N = N/10;  
	     //System.out.println("number3 is: " + N); 

	}
	  System.out.println("Reverse of the given number is: " + reverse); 


	}
}

