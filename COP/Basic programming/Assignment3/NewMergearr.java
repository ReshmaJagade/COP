import java.util.Arrays;
import java.util.Scanner;

public class NewMergearr {

	public static void acceptarr()
	{
		Scanner sc=new Scanner(System.in);
		int[][] arr1=new int[3][3];
		System.out.println("Enter Array Element for 1st Matrix:");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				arr1[i][j]=sc.nextInt();
			}
		}
		System.out.println("It is a 2D array");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(arr1[i][j]+"  ");
			}
			System.out.println();
		}
		Scanner nc=new Scanner(System.in);
		int[][] arr2=new int[3][3];
		System.out.println("Enter Array Element for 2nd matrix:");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				arr2[i][j]=sc.nextInt();
			}
		}
		System.out.println("It is a 2D array");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(arr2[i][j]+"  ");
			}
			System.out.println();
		}
		
		int fal = arr1.length;        
		int sal = arr2.length;   
		int[] result=new int[fal+sal];
		//int[] result = new int[fal + sal];  
		System.arraycopy(arr1, 0, result, 0, fal);  
		System.arraycopy(arr2, 0, result, fal, sal);
		
		System.out.println(Arrays.toString(result)); 
		
	}
	public static void main(String[] args)
	{
		//int[] firstArray = {23,45,12,78,4,90,1};        
		//int[] secondArray = {77,11,45,88,32,56,3};
		  
		 acceptarr();

	}

}
