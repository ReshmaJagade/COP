//2:Write a program to adddition of two numbers also addition of two characters.
package myproj;

import java.util.Scanner;

public class Addition {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
     	int no1,no2;
     	int result;
		char ch1;
		ch1='A';
		char ch2;
		ch2='B';
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter no1:");
		no1=sc.nextInt();
		System.out.print("Enter no2:");
		no2=sc.nextInt();
		result=no1+no2;
		System.out.println("Addition of int="+result);
	   System.out.println("Addition of char="+ch1+ch2);
	}

}
///test Reshma jagade 