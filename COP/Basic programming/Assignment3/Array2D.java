//2:Write a Java program to accept 2D aaray elements.Display all elements.
import java.util.Scanner;
public class Array2D
{
   public static void main(String[] args)
	{
        Scanner sc=new Scanner(System.in);
		int[][] arr=new int[3][3];
		System.out.println("Enter Array Element:");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}
		System.out.println("It is a 2D array");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(arr[i][j]+"  ");
			}
			System.out.println();
		}
			sc.close();
	}
   }
