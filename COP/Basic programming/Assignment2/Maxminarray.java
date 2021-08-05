//8:Write a Java program to find the maximum and minimum value of an array.
import java.util.Scanner;
public class Maxminarray {

	public static void main(String[] args) 
	{
	    int max,min;
		int[] arr;
		int no;
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size:");
		int size = sc.nextInt();// size
		arr = new int[size];
		System.out.println("Enter Array Elements");
		for(int i=0;i<arr.length;i++)
		{
			
			arr[i]=sc.nextInt();
		}
		System.out.println("Array Element");

		for(int i:arr)
		{
			System.out.println(i);
		}
	
	max=arr[0];
	for(int i=0;i<arr.length;i++)
	{
		if(arr[i]>max)
			
		max=arr[i];
	}
	System.out.println("Maximum number is:"+max);

    min=arr[0];
	for(int i=0;i<arr.length;i++)
	{
		if(arr[i]<min)
			
		min=arr[i];
	}
	System.out.println("Minimum number is:"+min);
	}
}
