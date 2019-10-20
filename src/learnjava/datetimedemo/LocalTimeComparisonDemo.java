package learnjava.datetimedemo;

import java.time.LocalDate;
import java.time.LocalTime;

public class LocalTimeComparisonDemo {

	public static void main(String[] args) {
		
		LocalTime time1 = LocalTime.parse("10:30:45");

		LocalTime time2 = LocalTime.parse("11:15");
		boolean isAfter = time1.isAfter(time2);
		System.out.println(time1+" Is after "+time2+"=" + isAfter);

		time2 = LocalTime.of(10,30,45);
		boolean isEqual = time1.equals(time2);
		System.out.println(time1+" Is equal "+time2+"=" + isEqual);
		
		time2 = LocalTime.parse("12:15");
		boolean isBefore = time1.isBefore(time2);
		System.out.println(time1+" Is before "+time2+"=" + isBefore);

//		boolean isLeapYear = time1.isLeapYear();
//		System.out.println("Is LeapYear:" + isLeapYear);

	}

}
