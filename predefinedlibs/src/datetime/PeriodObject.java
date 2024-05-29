package datetime;

import java.time.LocalDate;
import java.time.Period;

public class PeriodObject {

	public static void main(String[] args) {
		/*
		 * Period object can be used to represent quantity of time Ex:
		 */
		LocalDate today = LocalDate.now();
		LocalDate birthday = LocalDate.of(1976, 04, 05);
		Period p = Period.between(birthday, today);
		System.out.printf("age is %d year %d months %d days", p.getYears(), p.getMonths(), p.getDays());
	}

}
