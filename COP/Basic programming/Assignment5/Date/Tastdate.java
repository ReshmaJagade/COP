package Date;

public class Tastdate {

	public static void main(String[] args) 
	{
		Date d1=new Date();
		d1.setDay(10);
		d1.setMonth(12);
		d1.setYear(2000);
		
		System.out.println(d1.getDay());
		System.out.println(d1.getMonth());
		System.out.println(d1.getYear());
		
		Date d2=new Date();
		d2.displaydate();
		Date d3=new Date(4,5,2021);
		d3.displaydate();


	}

}
