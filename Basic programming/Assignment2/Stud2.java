import java.util.Scanner;
public class Stud2 {

	public static void main(String[] args) 
	{
		 int marks[] = new int[5];
	        int i;
	        float total=0, avg;
	        Scanner scanner = new Scanner(System.in);
	        Scanner sc = new Scanner(System.in);
			System.out.print("Enter Roll No:");
			int rollno = sc.nextInt();
			System.out.print("Enter the Name:");
			String name = sc.next();
			
	      for(i=0; i<5; i++) 
	      { 
	           System.out.print("Enter Marks of Subject"+(i+1)+":");
	           marks[i] = scanner.nextInt();
	           total = total + marks[i];
	        }
	        scanner.close();
	        avg = total/5;
	        System.out.println("Avg="+avg);
	        double per=total/(5*100)*100;
	        System.out.println("per="+per);
	        
	        System.out.print("The student Grade is: ");
	        if(per>=75)
	        {
	            System.out.print("A");
	        }
	        else if(per>=74 && per<60)
	        {
	           System.out.print("B");
	        } 
	        else if(per>=59)
	        {
	            System.out.print("C");
	        }
	        else
	        {
	            System.out.print("D");
	        }

	}

}
