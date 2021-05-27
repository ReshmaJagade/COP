package Employee;
public class Testemployee {
	public static void main(String[] args)
	{
		int[] arr=new int[5];
	     arr[0]=10;
	     Employee[] allEmps=new Employee[5];
	     Employee emp1=new Employee(1, "Reshma","Pune",20000);
	     Employee emp2=new Employee(2, "Shubham","Pune",19000);
	     Employee emp3=new Employee(3, "Yash","Pune",18000);
	     Employee emp4=new Employee(4, "Suraj","Pune",36000);
	     Employee emp5=new Employee(5, "Vivek","Pune",45000);
	     allEmps[0]=emp1;
	     allEmps[1]=emp2;
	     allEmps[2]=emp3;
	     allEmps[3]=emp4;
	     allEmps[4]=emp5;
	     System.out.println("------------------");
	    for(int i=0;i<allEmps.length;i++)
	    {
	    	allEmps[i].displayInfo();
	     }
	    for(Employee emp:allEmps)
	    {
	    	emp.displayInfo();
	    }
	   System.out.println("----Salary Greater than 20000---");
	   for(int i=0;i<allEmps.length;i++)
	   {
		   if(allEmps[i].getSalary()>20000)
		   {
			   System.out.println("Name of Employee:"+allEmps[i].getName());
		   }
	   }
	}
}
