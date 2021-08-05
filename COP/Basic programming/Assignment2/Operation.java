import java.util.Scanner;

public class Operation {

	public static void main(String[] args)
	{
		int arr[] = new int[5];
		 int i;
		 char choice;
	  float total=0;
	  double sum=0.0;
	  int sum1 = 0;
	  Scanner sc = new Scanner(System.in);
      for(i=0; i<5; i++) 
      { 
           System.out.print("Enter operand "+(i+1)+":");
           arr[i] = sc.nextInt();
           total = total + arr[i];
        } 
        System.out.println("Enter 1 for Max");
    	System.out.println("Enter 2 for Min.");
    	System.out.println("Enter 3 for Sum");
    	System.out.println("Enter 4 for Avg");
    	String s = sc.next();
    	choice = s.charAt(0);
    	switch(choice)
    	{
    	case '1':
       int max=arr[0];
    	for(i=0;i<5;i++)
    	{
    		if(arr[i]>max)
    		max=arr[i];
    	}
    	System.out.println("Max:"+max);
    	break;
    	
    	case '2':
    	int min=arr[0];
    	for(i=0;i<5;i++)
    	{
    		if(arr[i]<min)
    		min=arr[i];
    	}
    	System.out.println("Min:"+min);
    	break;
    	
    	case '3':
    	for(i=0;i<5;i++)
    	{
    		sum=sum+arr[i];
    	}
    	System.out.println("Sum:"+sum);
    	break;
    	
    	case '4':
    		
    		for(int i1:arr)
			{
				sum1=sum1+i1;
			}
			System.out.println("Average of Array: "+(sum1/5));
			break;

    	default:
    	System.out.println("Error");
   }
	}
}