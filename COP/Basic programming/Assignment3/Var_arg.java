//4.Write a function /method which takes variable no of int numbers as an argument and
//returns the sum of these arguments as an output.
public class Var_arg {

	public static void sum(int...a)
	{
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			sum=sum+a[i];
		}
		System.out.println("Sum of "+a.length+" Elements: "+sum);
	}
	public static void main(String[] args) 
	{
		int a=10;
		sum();
		sum(a);
		sum(a,a,a,a,a);
	}

}
