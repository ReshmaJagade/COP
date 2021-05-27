import java.util.Scanner;

public class Demo {

	public static void main(String[] args) 
	{
		
		        Scanner scan = new Scanner(System.in);
		        System.out.println("Welcome to HackerRank's Java tutorials!");
		        String s=scan.next();
		       System.out.println("enter the value od double");
		        double d=scan.nextDouble(); 
		        System.out.println("enter the int");
		        int i = scan.nextInt();
		        scan.close();
		        

		       

		        System.out.println("String: " + s);
		        System.out.println("Double: " + d);
		        System.out.println("Int: " + i);
	}

}
