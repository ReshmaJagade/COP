import java.util.Scanner;

//2:>Create a java applicstion for the following.
// Create a Customer class , with data members (all private : tight encapsulation)
//name(String),email(String),age(int), creditLimit(double)
//2.1 Write acceptInfo() method to accept customer details:
//2.2 Write a method , showDetails to display customer name & credit limit only.
//Naming convention : public void setCreditLimit(double limit) {...}
//public double getCreditLimit(){...}
//2.3 Create a TestCustomer class . Use scanner to accept user i/ps.
//Create 2 customers object.
//Display customer details of both customers.
//Prompt user , for changing creditLimit of the customer2.
//Display new credit limit on the console.

public class Custumerclass
{
    private String name;
	private String email;
	private int age;
	private double creditLimit;
	public void acceptInfo()
	{	Scanner sc = new Scanner(System.in);
		System.out.print("Customer Name:");
		name = sc.next();
		System.out.print("Customer Email:");
		email= sc.next();
		System.out.print("Customer age:");
		age = sc.nextInt();
		System.out.print("CreditLimit:");
		creditLimit = sc.nextDouble();
	}
    public void setcreditLimit(double credit)
	{
		creditLimit=credit;
	}
	public double getcreditLimit()
	{
      return creditLimit;
	}
	public void displayInfo()
	{
		System.out.println("Customer Name:" + name);
		//System.out.println("Customer Email:" + email);
		//System.out.println("Customer Age:" + age);
		System.out.println("CreditLimit:" + creditLimit);
	}

}
