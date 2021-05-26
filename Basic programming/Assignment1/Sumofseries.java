//9:Sum of series :1+2+3+….+n
package myproj;

import java.util.Scanner;

public class Sumofseries {

	public static void main(String[] args)
	{
		int sum = 0;
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter n=:");
		n=sc.nextInt();
		
        for (int i = 1; i <= n; i++)
                sum = sum + i;
        System.out.println("Sum of the series is="+sum);
         
       sc.close();
		}
	}

