//1:Java program to print the following pattern on the console
//*
//* *
//* * *
//* * * *
//* * * * *
public class Printstar {

	public static void main(String[] args) 
	{
		 int size = 0;  
	       Character c;  
	       System.out.println();  
	       size = 6;  
	       int i, j, k;  
	       for (i = 0; i < size + 1; i++)
	       {   	   
	           for (k = 0; k < (i - 1); k++) 
	           {  
	               System.out.print("*");  
	           }  
	           System.out.println();  
	         }  
	   }  
	   }  