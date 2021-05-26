//13:Write a  program to print all Prime numbers between 1 to n.
package myproj;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int N;
		Scanner in = new Scanner(System.in);
	     System.out.print("Enter a number:");
	     N = in.nextInt();
		for(int i=1;i<=N;i++)
		{
			if(i%2!=0)
			{
				System.out.println(i);
			}
		}

	}

}
