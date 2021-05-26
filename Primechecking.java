//8:Check if number is a prime number or not.
package myproj;

import java.util.Scanner;

public class Primechecking {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int i;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter no1:");
		i=sc.nextInt();
		
		if(i%2!=0)
		{
			System.out.println("Number is prime="+i);
		}
		else
			System.out.println("Number is not prime");
	}

}
