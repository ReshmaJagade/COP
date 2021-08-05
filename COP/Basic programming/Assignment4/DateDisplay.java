//1:Create Date class with  data members day,month,year.
//Write a method to accept all data members.write display function to display date.
import java.util.Scanner;
public class DateDisplay 
{
	private int d,m,y;
	public void acceptInfo()
	{	Scanner sc = new Scanner(System.in);
		System.out.print("Date:");
		d = sc.nextInt();// local variable inside function
		System.out.print("Month:");
		m= sc.nextInt();
		System.out.print("Year:");
		y = sc.nextInt();
		//sc.close();
	}
   public void displayInfo() 
	{
		System.out.print("Given Date:");
		System.out.println(d+"/"+m+"/"+y);	
	}
}
