package learnjava.datetimedemo;

import java.time.LocalDate;
import java.time.Period;

public class LocalDateComparisonDemo {

	public static void main(String[] args) {
		LocalDate date1 = LocalDate.parse("2017-05-17");
		
		LocalDate date2 = LocalDate.parse("2014-09-14");
		boolean isAfter= date1.isAfter(date2);
		System.out.println("Is after:"+isAfter);
		
		LocalDate date3 = LocalDate.of(2017, 05, 17);
		boolean isEqual = date1.isEqual(date3);
		System.out.println("Is Equal:"+isEqual);
		
		boolean isLeapYear = date1.isLeapYear();
		System.out.println("Is LeapYear:"+isLeapYear);
		

	}

}
