package myproj;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args)
	{
		int n;
		int c=0, a, temp; 
		  
		 Scanner in = new Scanner(System.in);
	     System.out.print("Enter a number:");
	     n = in.nextInt();
	     temp=n;
	     while(n>0)  
	     {  
	     a=n%10; 
	     System.out.println("a="+a);
	     n=n/10;  
	     System.out.println("n="+n);
	     c=c+(a*a*a);  
	     System.out.println("c="+c);
	     }  
	     if(temp==c)  
	     System.out.println("armstrong number");   
	     else  
	         System.out.println("Not armstrong number");   
	    }  
	   
}
