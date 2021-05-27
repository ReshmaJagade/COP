//1:Create Date class with  data members day,month,year.
public class TestDate {
public static void main(String[] args) 
	{
		DateDisplay date1=new DateDisplay();
		date1.acceptInfo();//
		date1.displayInfo();
		
		System.out.println("---------------------");
		DateDisplay date2=new DateDisplay();
		date2.acceptInfo();
		date2.displayInfo();
		}
}
