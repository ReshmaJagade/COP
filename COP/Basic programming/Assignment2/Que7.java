//7:Write a Java program , accept array ,accept number from user and  
//find the index of number in
//array if present else show message not exist.
import java.util.Scanner;
public class Que7 
{
	 public static int findIndex(int arr[], int t)
	    {
	        if (arr == null)
	        {
	            return -1;
	        }
	        int len = arr.length;
	        int i = 0;
	        while (i < len)
	        {
	          if (arr[i] == t)
	          {
	                return i;
	            }
	            else 
	            {
	                i = i+5;
	                System.out.println("Message not exist");
	            }
	        }
	        return -1;
	    }
 public static void main(String[] args) 
 {
	 System.out.println("----------------------");
		int[] arrs=new int[5];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<arrs.length;i++)
		{
			arrs[i]=sc.nextInt();
			
		}
		System.out.println("----------------");
		for(int i=0;i<arrs.length;i++)
		{
			System.out.println(arrs[i]);
		}
		  System.out.println("Index position is:"+ findIndex(arrs,11));
	}

}
