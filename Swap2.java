
//Swap without using third variable
package myproj;

import java.util.Scanner;

public class Swap2 {

	public static void main(String[] args)
	{
		int x,y;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter variable x and y:");
		x=sc.nextInt();
		y=sc.nextInt();
		x=x+y;
		y=x-y;
		x=x-y;
		System.out.println("After swap x=" +x);
		System.out.println("After swap y=" +y);
	}

}
