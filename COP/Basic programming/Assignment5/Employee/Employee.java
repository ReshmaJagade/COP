package Employee;
import java.util.Scanner;
public class Employee 
{
    private int empid;
	private String name;
	private String add;
	private double salary;
	public Employee()
	{	
	empid=1;
	setName("Ram");
	add="Pune";
	setSalary(10000);
	}
	public Employee(int empid,String name,String add,double salary)
	{
		this();
        this.empid=empid;
		this.setName(name);
		this.add=add;
		this.setSalary(salary);
	}
	public void acceptInfo()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Id Name Address Sal");
		empid=sc.nextInt();
		setName(sc.next());
		add=sc.next();
		setSalary(sc.nextDouble());
	}
	public void acceptInfo(int id,String nm,String addr,double sal)
	{
		empid=id;
		setName(nm);
		add=addr;
		setSalary(sal);
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) 
	{
		this.salary = salary;
	}
	public void displayInfo()
	{
		System.out.println("------------------");
		System.out.println("EmpId:"+this.empid);
		System.out.println("Name:"+this.getName());
		System.out.println("Address:"+add);
		System.out.println("Salary:"+getSalary());
	}
	
}
