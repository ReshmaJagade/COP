//3:Consider that payroll software needs to be developed for computerization of
//operations of an ABC organization. The organization has employees.
//3.1. Construct a class Employee with following members using private access
//specifies:Employee Id integer,Employee Name string,Basic Salary double
// HRA double,Medical double,PF double,PT double,Net Salary double,Gross Salary double
//Please use following expressions for calculations:
//*HRA = 50% of Basic Salary,*PF = 12% of Basic Salary,*PT = Rs. 200
//3.2. Write methods to display the details of an employee and calculate the gross
//and net salary.
//* Goss Salary = Basic Salary + HRA + Medical,*Net Salary=Gross Salary–(PT + PF)
//Create a TestEmployee Class.Create Object of employee class 
//and assign values and display Details.
import java.util.Scanner;
public class Employee
{
	private String name;
	private int id;
	private double basic_salary;
	private double hra,medical,pf,pt;
	private double net_salary,gross_salary;
	public void acceptInfo()
	{	Scanner sc = new Scanner(System.in);
		System.out.print("Employee Name:");
		name = sc.next();
		System.out.print("Employee Id:");
		id= sc.nextInt();
		System.out.print("Enter Basic Salary:");
		basic_salary = sc.nextDouble();
	}
	public void calculatesal()
	{
		hra=0.5*basic_salary;
		pf=0.12*basic_salary;
		pt=200;
		medical=500;
		gross_salary=basic_salary+hra+medical;
		net_salary=gross_salary-(pt+pf);
	}
	public void display()
	{
		System.out.println("Employee Name:"+name);
		System.out.println("Employee Id:"+id);
		System.out.println("Gross Salary of Employee:"+gross_salary);
		System.out.println("NET Salary of Employee:"+net_salary);
	}
}
