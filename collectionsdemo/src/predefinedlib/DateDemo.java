package predefinedlib;

import java.util.Calendar;
import java.util.Date;

public class DateDemo {

	public static void main(String[] args) {
		Date d1 = new Date();
		Calendar cal = Calendar.getInstance();
		
		//To get current date and time using Date object
		System.out.println(d1.toString());
		
		System.out.println(cal.toString());
		//To get DAY_OF_MONTH
		System.out.println(cal.get(Calendar.DAY_OF_MONTH));
		System.out.println(cal.get(Calendar.MONTH));
		System.out.println(cal.get(Calendar.DAY_OF_YEAR));
		System.out.println(cal.get(Calendar.YEAR));
	}
	
}
