package datetime;

import java.time.Year;

import java.time.*;

public class Leapyear {

	public static void main(String[] args) {

	//	int n = Integer.parseInt(args[0]);
		int n =1992;
		Year y = Year.of(n);
		if (y.isLeap())
			System.out.printf("%d is Leap year", n);
		else
			System.out.printf("%d is not Leap year", n);
	}
}
