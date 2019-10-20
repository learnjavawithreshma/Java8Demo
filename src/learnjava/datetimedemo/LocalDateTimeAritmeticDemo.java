package learnjava.datetimedemo;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class LocalDateTimeAritmeticDemo {

	public static void main(String[] args) {
		LocalDateTime dateTime = LocalDateTime.of(2017,05,17,5,25);
		
		LocalDateTime dateTime2 = dateTime.plusDays(5);//add 5 days
		System.out.println("Date "+dateTime+" plus 5 days is "+dateTime2);
		
		dateTime2 = dateTime.minusMonths(4); //subtract 4 months
		System.out.println("Date "+dateTime+" minus 4 months is "+dateTime2);
		
		dateTime2 = dateTime.plusWeeks(3);
		System.out.println("Date "+dateTime+" plus 3 weeks is "+dateTime2);
		
		dateTime2 = dateTime.plusHours(2);
		System.out.println("Date "+dateTime+" plus 2 hours is "+dateTime2);
		
		dateTime2 = dateTime.minusMinutes(10);
		System.out.println("Date "+dateTime+" minus 10 minutes is "+dateTime2);
		
		dateTime2 = dateTime.withYear(2019);//year set to 2019
		System.out.println("Date "+dateTime+" with year set to 2019 is "+dateTime2);
		
		dateTime2 = dateTime.withMonth(9);//month set to september
		System.out.println("Date "+dateTime+" with month set to september is "+dateTime2);
		
		dateTime2 = dateTime.withHour(8);// hour set to 8
		System.out.println("Date "+dateTime+" with hour set to 8 is "+dateTime2);

	}

}
