package learnjava.datetimedemo;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;

public class LocalTimeExtractionDemo {

	public static void main(String[] args) {
	LocalTime time = LocalTime.parse("11:45:15");
	System.out.println("Time is "+time);
		
		int hour = time.getHour();
		System.out.println("Hour="+hour);
		
		int minute = time.getMinute();
		System.out.println("Minute="+minute);
		
		int second = time.getSecond();
		System.out.println("second="+second);
		
		int nanoSecond = time.getNano();
		System.out.println("nanoSecond="+nanoSecond);

	}

}
