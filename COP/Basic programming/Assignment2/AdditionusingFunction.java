//4:Write functions for making addition of diffrent types(use FunctionOverloading);
public class AdditionusingFunction 
{

	public static void add1()
	{
	System.out.println("Adding1");	
	}
	
	public static void add2(int i,int j)
	{
		System.out.println("Add2="+(i+j));
	}
	
	public static void add3(int i,int j,int k)
	{
		System.out.println("Add3="+(i+j+k));
	}
	
	public static void add4(double i,int j)
	{
		System.out.println("Add4="+(i+j));
	}
	
	public static void add5(String i,String j)
	{
		System.out.println("Add5="+(i+" "+j));
	}
	
	public static void main(String[] args)
	{
		int a=20,b=30,c=10;
		double d1=10.30;
		
		add1();
		add2(a,b);
		add3(a,b,c);
		add4(d1,a);
		add5("Reshma","Jagade");
		
	}

}
