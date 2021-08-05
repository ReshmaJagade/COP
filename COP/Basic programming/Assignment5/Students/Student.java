package Students;
import java.util.Scanner;
public class Student
{
    private String grade;
     public int rollno;
     public  String name;
      double totalMarks;
     public void acceptInfo()
 	{
 		Scanner sc=new Scanner(System.in);
 		System.out.print("Roll no:");
 		rollno=sc.nextInt();
 		System.out.print("Name:");
 		name=sc.next();
 		System.out.print("Grade:");
 		grade=sc.next();
 		System.out.print("Total Mark:");
 		totalMarks=sc.nextDouble();
 		//sc.close();
 	}
 	public void dispInfo()
	{
 		System.out.println ("Display Student Information");
		System.out.println ("Roll NO:"+rollno);
		System.out.println("Name:"+ name );
		System.out.println("Grade:"+ grade);
		System.out.println("Total Marks:"+ totalMarks );
		}
  }
