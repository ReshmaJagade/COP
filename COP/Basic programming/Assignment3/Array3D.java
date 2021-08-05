import java.util.Scanner;

public class Array3D {

	public static void main(String[] args) 
	{
		  Scanner sc=new Scanner(System.in);
			int[][][] arr=new int[3][3][3];
			System.out.println("Enter Array Element:");
			for(int i=0;i<2;i++)
			{
				for(int j=0;j<2;j++)
				{
					for(int k=0;k<3;k++)
					{
					arr[i][j][k]=sc.nextInt();
				}
			}
		}
			System.out.println("It is a 3x4 array");
			for(int i=0;i<2;i++)
			{
				for(int j=0;j<2;j++)
				{
					for(int k=0;k<3;k++)
		         { 
				    System.out.print(arr[i][j][k]+"  ");
				}
				System.out.println();
			}
				sc.close();

	}

	}
}
