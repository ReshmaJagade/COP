//
import java.util.Scanner;
public class Newarradd 
{
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
		
	int rows = 3,columns=3;
	int[][] sum = new int[rows][columns];
   
	for(int i = 0; i < rows; i++)
   {
	for (int j = 0; j < columns; j++)
       {
           sum[i][j] = arr1[i][j] + arr2[i][j];
        }
   }
   System.out.println("Sum of two matrices is: ");
   for(int[] row : sum) 
   {
       for (int column : row)
       {
           System.out.print(column + "    ");
           
       }
       System.out.println();
      }

	}
	public static void main(String[] args)
	{ 
		acceptarr();	
	}
}
