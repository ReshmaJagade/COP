import java.util.Scanner;
public class Testcustumer 
{
   public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		Custumerclass customer1=new Custumerclass();
		customer1.acceptInfo();//
		customer1.displayInfo();
		
		System.out.println("---------------------");

		Custumerclass customer2=new Custumerclass();
		customer2.acceptInfo();
		double cl;
		System.out.print("Enter credit for Customer2 limit:");
		cl=s.nextDouble();
		customer2.setcreditLimit(cl);
		customer2.getcreditLimit();
		customer2.displayInfo();
		}
}
