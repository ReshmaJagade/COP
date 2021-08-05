package Customer;
import java.util.Scanner;
public class Customer 
{
	private String name;
	private String email;
	private int age;
	private double creditLimit;
	
	Customer()
	{
		this.name="Riya";
		this.email="riya@gmail.com";
		this.age=25;
		this.creditLimit=15000;
	}
	public Customer(String name,String email,int age,double creditLimit)
	{
		this.name=name;
		this.email=email;
		this.age=age;
		this.creditLimit=creditLimit;
	}
	public void acceptInfo()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your Name:");
		name=sc.next();
		System.out.println("Enter your Email:");
		email=sc.next();
		System.out.println("Enter your Age:");
		age=sc.nextInt();
		
	}
	public void setCreditLimit(double limit)
	{
		creditLimit=limit;
	}
	public void showDetails()
	{
		System.out.println("Customer Information:");
		System.out.println("Name:"+name);
//		System.out.println("Email:"+email);
//		System.out.println("Age:"+age);
		System.out.println("Credit Limit:"+creditLimit);
		
	}
}
