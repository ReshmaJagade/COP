package Batches;
import java.util.Scanner;
import Students.Student;
public class Batch {
    Student s=new Student();
	public void acceptInfo()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter roll no:");
		s.rollno=sc.nextInt();
		System.out.print("Enter Name:");
		s.name=sc.next();
//		System.out.print("Grade:");//cant access because it is private
//		s.grade=sc.next();
//		System.out.print("Total Marks:");
//		s.totalMarks=sc.next();
	}
	public void dispInfo()
	{
		System.out.println("Display Student Information:");
		System.out.println ("Roll NO:"+s.rollno);
		System.out.println("Name:"+ s.name );
    }
}
