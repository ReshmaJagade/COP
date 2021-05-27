import java.util.Scanner;

//2:Write a program which will accept student information like rollno,name,
//5 subject marks.calculate total and percentage.calculate grade.. 
//           per >75 grade :A
//           per<74 and >60 :B
//           per<59  :C

public class Studentinfo 
{
	public static void main(String[] args)
	{   
		String name;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Roll No:");
		int rollno = sc.nextInt();
		System.out.print("Enter the Name:");
		name=sc.next();
		System.out.println("Enter the 5 subject marks:");
		int[] marks=new int [5];
		double total=0,avg;
		for(int i=1;i<=marks.length;i++)
		{
			marks[i]=sc.nextInt();
			total = total + marks[i];
			
		}
		sc.close();
		
		System.out.print(total);
		
		 avg = total/6;
	        System.out.print("The student Grade is: ");
	        if(avg>=80)
	        {
	            System.out.print("A");
	        }

	}

}
