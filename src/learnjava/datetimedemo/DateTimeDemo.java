package learnjava.datetimedemo;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DateTimeDemo {
	
	public static void main(String[] args) {
		LocalDate date = LocalDate.parse("2017-05-18");
		System.out.println("Date is "+date);
		
		LocalTime time = LocalTime.of(5,15);
		System.out.println("Time is "+time);
		
		LocalDateTime dateTime = LocalDateTime.of(2019,05,17,11,30);
		System.out.println("Date and time is :"+dateTime);

	}

//	public static void main(String[] args) {
//		LocalDate date = LocalDate.now();
//		System.out.println("Today's date is "+date);
//		
//		LocalTime time = LocalTime.now();
//		System.out.println("Current time is "+time);
//		
//		LocalDateTime dateTime = LocalDateTime.now();
//		System.out.println("Current Date and time is :"+dateTime);
//
//	}

}
