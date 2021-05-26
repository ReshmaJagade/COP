//5:Write a program to swap two numbers.
package myproj;

import java.util.Scanner;

public class Swap {

	public static void main(String[] args) 
	{
		int x,y,t;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter X:");
		x=sc.nextInt();
		System.out.print("Enter Y:");
		y=sc.nextInt();
		t=x;
		x=y;
		y=t;
		System.out.println("X="+x);		
		System.out.println("Y="+y);	
        sc.close();
	}

}
