import java.util.Scanner;

public class Stationaryshop {
public static void main(String[] args)
{
	float Q,cost = 0;
	char choice;
	//Declare input as scanner
	Scanner input = new Scanner(System.in);

	//Take inputs
	System.out.println("Enter a for pen.");
	System.out.println("Enter b for pencil.");
	System.out.println("Enter c for notebook.");
	System.out.println("Enter d for bottle.");
	System.out.println("Enter e for colorbox.");
	String s = input.next();
	choice = s.charAt(0);

	//add a switch statement
	switch(choice)
	{
	case 'a':
	System.out.println("Enter Quantity of Pen:");
	Q= input.nextFloat();
	cost = 10*Q;
	break;
	
	case 'b':
		System.out.println("Enter Quantity of Pencil:");
		Q= input.nextFloat();
		cost = 5*Q;
		break;
		
	case 'c':
		System.out.println("Enter Quantity of Notebook:");
		Q= input.nextFloat();
		cost = 20*Q;
		break;
	
	case 'd':
		System.out.println("Enter Quantity of Bottle:");
		Q= input.nextFloat();
		cost = 30*Q;
		break;
		
	case 'e':
		System.out.println("Enter Quantity of Colorbox:");
		Q= input.nextFloat();
		cost = 50*Q;
		break;
	
	default:
	System.out.println("Error");
	}

	System.out.println("Cost = "+cost);

	}

}
