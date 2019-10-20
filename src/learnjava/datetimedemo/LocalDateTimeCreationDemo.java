package learnjava.datetimedemo;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class LocalDateTimeCreationDemo {

	public static void main(String[] args) {
		LocalDateTime dateTime1 = LocalDateTime.now();
		System.out.println("Today's date is "+dateTime1);
		
		LocalDateTime dateTime2 = LocalDateTime.parse("2019-07-15T10:15:30");
		System.out.println("Date2 is "+dateTime2);
		
		dateTime2 = LocalDateTime.of(2017,05,17,5,25);
		System.out.println("Date3 is "+dateTime2);
		
		
		dateTime2 = LocalDateTime.of(2017,Month.APRIL,17,5,25);
		System.out.println("Date4 is "+dateTime2);
		
		LocalDate date = LocalDate.of(201, 9, 14);
		LocalTime time = LocalTime.of(4, 50);
		
		dateTime2 = LocalDateTime.of(date,time);
		System.out.println("Date5 is "+dateTime2);

	}

}
