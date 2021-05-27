package Customer;

import java.util.Scanner;

public class Testcustomer {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Customer c1=new Customer();
	    c1.acceptInfo();
	    c1.showDetails();
		Customer c2=new Customer();
		c2.setCreditLimit(40000);
		c2.showDetails();
		System.out.println("Enter name,Email,Age,CreditLimit");
		Scanner sc=new Scanner(System.in);
		String name=sc.next();
		String email=sc.next();
		int age=sc.nextInt();
		double creditLimit=sc.nextDouble();
		Customer c3=new Customer(name,email,age,creditLimit);
		c3.showDetails();
		}
}
