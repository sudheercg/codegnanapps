package datetime;

import java.time.*;
/*Once we get LocalDate object we can call the following methods
 *  on that object to retrieve 
    Day,month and year values separately*/

class Test {
	public static void main(String[] args) {
		LocalDate date = LocalDate.now();
		System.out.println(date);
		int dd = date.getDayOfMonth();
		int mm = date.getMonthValue();
		int yy = date.getYear();
		System.out.println(dd + "..." + mm + "..." + yy);
		System.out.printf("\n%d-%d-%d", dd, mm, yy);

		LocalTime time = LocalTime.now();

		int h = time.getHour();
		int m = time.getMinute();
		int s = time.getSecond();
		int n = time.getNano();
		System.out.printf("\n%d:%d:%d:%d\n", h, m, s, n);
		
		/*
		 * If we want to represent both Date and Time then we should go for
		 * LocalDateTime object.
		 */
		LocalDateTime dt = LocalDateTime.now();
		System.out.println(dt);
		
		
	/*	We can represent a particular Date and Time
		by using LocalDateTime object as follows.*/
		
		 LocalDateTime dt1 = LocalDateTime.of(1995,Month.APRIL,28,12,45);
		 System.out.println(dt1);
		 
		 System.out.println("After six months: "+dt.plusMonths(6));
		 System.out.println("Before six months: "+dt.minusMonths(6));
		 
		 
		
		
		
		
		
		
		
		

	}
}