import java.util.Scanner;
public class Salary 
{
	public static void main(String[] args) 
	{
	    float basic;
		double gross;
		double da;
		double hra;
		Scanner sc=new Scanner(System.in);
		System.out.println("basic salary of an employee:");
	    basic=sc.nextFloat();
	   if(basic <= 10000)
	    {
	        da  = basic * 0.8;
	        hra = basic * 0.2;
	    }
	    else if(basic <= 20000)
	    {
	        da  = basic * 0.9;
	        hra = basic * 0.25;
	    }
	    else
	    {
	        da  = basic * 0.95;
	        hra = basic * 0.3;
	    }
        gross = basic + hra + da;
        System.out.println("GROSS SALARY OF EMPLOYEE =" +gross);

	}
}
