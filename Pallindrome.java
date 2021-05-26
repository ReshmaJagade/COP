//10:Check whether the number is palindrome or not?
package myproj;

import java.util.Scanner;

public class Pallindrome {

	public static void main(String[] args)
	{
		int n;
		int num;
		int rev=0;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter no:");
		n=sc.nextInt();
		num=n;
		while(n!=0)
		{
			rev=(rev*10)+(n%10);
			n/=10;
			//System.out.println("rev"+rev);		
		}
		if(rev==num)
		{
			System.out.println("number is pallindrom");
		}
		else
		{
			System.out.println("number is not pallindrom");
			
		}
		sc.close();
	}
}
