package learnjava.datetimedemo;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DateArithmeticDemo {
	
	public static void main(String[] args) {
		
		LocalDate date = LocalDate.parse("2019-07-15");
		
		
		//add 5 days
		LocalDate date2 = date.plusDays(5);
		System.out.println("Date "+date+" plus 5 days is "+date2);
		
		date2 = date.minusMonths(4);
		System.out.println("Date "+date+" minus 4 months is "+date2);
		
		LocalTime time1 = LocalTime.parse("10:45");
		
		LocalTime time2 = time1.plusMinutes(10);
		System.out.println("Time "+time1+" with 10 minutes added is "+time2);
		
		LocalDateTime dateTime1 = LocalDateTime.of(2019,05,17,11,30);
		
		LocalDateTime dateTime2 = dateTime1.minusYears(1);
		System.out.println("Date Time "+dateTime1+" with 1 year subtracted is "+dateTime2);

	}

//	public static void main(String[] args) {
//		LocalDate date = LocalDate.parse("2019-07-15");
//		
//		
//		//add 5 days
//		LocalDate date2 = date.plusDays(5);
//		System.out.println("Date "+date+" plus 5 days is "+date2);
//		
//		date2 = date.minusMonths(4);
//		System.out.println("Date "+date+" minus 4 months is "+date2);
//		
//		date2 = date.withYear(2019);
//		System.out.println("Date "+date+" with year set to 2019 is "+date2);
//		
//		LocalTime time1 = LocalTime.parse("10:45");
//		
//		LocalTime time2 = time1.plusMinutes(10);
//		System.out.println("Time "+time1+" with 10 minutes added is "+time2);
//		
//		time2 = LocalTime.parse("08:45");
//		boolean isAfter = time1.isAfter(time2);
//		System.out.println("Time1 after time2 ="+isAfter);
//		
//		LocalDateTime dateTime1 = LocalDateTime.of(2019,05,17,11,30);
//		
//
//	}

}
