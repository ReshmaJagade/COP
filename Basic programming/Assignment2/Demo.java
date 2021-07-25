import java.util.Scanner;

public class Demo {

	public static void main(String[] args) 
	{
		int arr[],no,max,min;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of array:");
		int size=sc.nextInt();
		arr=new int[size];
		System.out.println("Enter array element:");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Array Element:");
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
		System.out.println("Minimun number is:"+min);
	}
}
