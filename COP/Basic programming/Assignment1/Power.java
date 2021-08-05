//4:Write a program to calculate power of a number.
package myproj;

import java.util.Scanner;

public class Power {

	public static void main(String[] args)
	{
		int base , exponent ;
       
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter base:");
		base =sc.nextInt();
		System.out.print("Enter the Exponent:");
		exponent=sc.nextInt();
		
        long result = 1;

        while (exponent != 0)
        {
            result *= base;
            --exponent;
        }

        System.out.println("Answer = " + result);
        sc.close();
	}

}
