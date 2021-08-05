//6:Write a program which read array of 5 elements and print reverse array.
import java.util.Scanner;
public class Reversearray {

	public static void main(String[] args) 
	{   
        int[] arr;
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size:");
		int size = sc.nextInt();// size
		arr = new int[size];
		System.out.println("Enter Array Elements");
		for(int i=0;i<arr.length;i++)
		{
			
			arr[i]=sc.nextInt();
		}
		System.out.println("Array Element in Reverse");

        for (int i =arr.length-1; i >= 0; i--)
        {  
            System.out.println(arr[i]); 
	    }

}
}
