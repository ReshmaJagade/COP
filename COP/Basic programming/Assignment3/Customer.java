//8: Create a java application for the following.
// Create a Customer class , with data members (all private : tight encapsulation)
//name(String),email(String),age(int).Supply a parameterized constructor to accept all
//details from user.Supply an argument less  constructor to
 //init default name to "Riya" , email to "riya@gmail.com",age=25.
 //Write a method displayCustomer to display customer details.
 import java.util.Scanner;
public class Customer {

	private String name;
	private String email;
	private int age;
	
	public Customer()//default constr
	{	
		System.out.println("---called default constr----");
	        name="Riya";
	        email="riya@gmail.com";
	        age=25;
	
	}
	public Customer(String name,String email,int age)
	{
		this();
		System.out.println("---called parameterised constr----");
		this.name=name;
		this.email=email;
		this.age=age;
	}
	public void displayInfo()
	{
		System.out.println("Display Customer Details:");
		System.out.println("Name:"+this.name);
		System.out.println("Email:"+this.email);
		System.out.println("Age:"+this.age);
	}
	public static void main(String[] args)
	{		
		Customer cust1=new Customer();
		cust1.displayInfo();
		
		Customer cust2=new Customer("Reshma","jagadereshma22@gmail.com",24);
        cust2.displayInfo();
	}

}
