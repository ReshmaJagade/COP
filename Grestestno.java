package myproj;

import java.util.Scanner;

public class Grestestno {

	public static void main(String[] args) 
	{
		int no1,no2,no3;
		int max;
		Scanner in=new Scanner(System.in);
		System.out.print("Enter no1:");
		no1=in.nextInt();
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter no2:");
		no2=in.nextInt();
		Scanner sm=new Scanner(System.in);
		System.out.print("Enter no3:");
		no3=in.nextInt();

		if(no1>no2)
		{
			if(no1>no3)
		    max=no1;
		    else
		    max=no3;
	   }
	   else
	   {
	   	   if(no2>no3)
	   	   max=no2;
	   	   else
	   	   max=no3;
		}
		System.out.println("Gretest no="+max);

}
}
