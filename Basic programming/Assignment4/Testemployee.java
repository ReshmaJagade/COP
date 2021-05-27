import java.util.Scanner;
public class Testemployee
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		Employee Ep1=new Employee();
		Ep1.acceptInfo();
		Ep1.calculatesal();
		Ep1.display();
		
		System.out.println("---------------------");

		Employee Ep2=new Employee();
		Ep2.acceptInfo();
		Ep2.calculatesal();
		Ep2.display();
	}
}
