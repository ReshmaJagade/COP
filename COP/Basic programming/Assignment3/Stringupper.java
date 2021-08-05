//1:Write a function to accept array of string.Display all elements in Uppercase.

public class Stringupper
{
	public static void  acceptArray(String[] names)
   {
		System.out.println("Converted Names in Upper case:");
	    for(int i=0;i<names.length;i++)
	{
	    	System.out.println(names[i].toUpperCase());
	 }
	
	  System.out.println("Converted Names in Lower case:");
	    for(int i=0;i<names.length;i++)
		{
		    	System.out.println(names[i].toLowerCase());
		    	
			}
}
    public static void main(String[] args)
	{
		for(int i=0;i< args.length;i++)
		{
			System.out.println(args[i]);
		}
		
		String[]  arr= {"Reshma","Shubham","Suraj","Vivek","Yash"};	
		acceptArray(arr);
		
	}

}
