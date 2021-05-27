//9:Create Date class with  data members day,month,year.create getter setter
//for data members.writ display function to display date
public class Date
{
    private int date;
    private int month;
    private int year;
    
    public Date()
    {
    }
    	
    public Date(int day, int month, int year) 
    {
    		this.date = date;
    		this.month = month;
    		this.year = year;
    }
    
    public int getDate()//getter
	{
		return date;
		
	}
    public void setDate(int date)//setter
	{
		this.date=date;	
	}
	
	public int getMonth()
	{
		return month;
	}

	public void setMonth(int month)
	{
		this.month = month;
	}

	public int getYear() 
	{
		return year;
	}

	public void setYear(int year)
	{
		this.year = year;
	}

	
	public void displayDate()
	{
		System.out.println("Date:"+date+"/"+month+"/"+year);
	}
	
	public static void main(String[] args)
	{
		Date dob = new Date(8, 5, 1982);
		dob.setYear(1990);
		dob.displayDate();
		
		
		Date doj = new Date();//
		doj.setDate(11);
		doj.setMonth(5);
		doj.setYear(2021);
		doj.displayDate();
		System.out.println("Display Date of joining:");
		System.out.println("Date :"+ doj.getDate());
		System.out.println("Month "+ doj.getMonth());
		System.out.println("Year "+ doj.getYear());

	}


}