package learnjava.datetimedemo;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;

public class LocalDateExtractionDemo {

	public static void main(String[] args) {
		LocalDate date = LocalDate.parse("2019-07-15");
		
		int day = date.getDayOfYear();
		System.out.println("DayOfYear="+day);
		
		int dayOfmonth = date.getDayOfMonth();
		System.out.println("DayOfmonth="+dayOfmonth);
		
		Month month = date.getMonth();
		System.out.println("Month="+month);
		
		DayOfWeek dayOfWeek = date.getDayOfWeek();
		System.out.println("DayOfWeek="+dayOfWeek);
		
		
		

	}

}
