////5:Write a program to accept array of 5 numbers and display it.
import java.util.Scanner;
public class Arraydisplay
{
   public static void main(String[] args) 
	{
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
	}
}
