
public class Swap 
{
   public static void swap()
   {

		int a,b,temp;
		a=10;
		b=20;
		temp=a;
		a=b;
		b=temp;
		System.out.println("Swap Output:");
		System.out.println("A="+a);
		System.out.println("B="+b);
		
   }
	public static void main(String[] args) 
	{
		System.out.println("-------main------");
		swap();
		

	}

}
