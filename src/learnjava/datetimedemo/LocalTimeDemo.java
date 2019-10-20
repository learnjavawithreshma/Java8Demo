package learnjava.datetimedemo;

import java.time.LocalDate;
import java.time.LocalTime;

public class LocalTimeDemo {

	public static void main(String[] args) {
		
		LocalTime time1 = LocalTime.now();
		System.out.println("Current time is "+time1);
		
		LocalTime time2 = LocalTime.parse("12:30");
		System.out.println("time2 is "+time2);
		
		LocalTime time3 = LocalTime.of(5, 30);
		System.out.println("time3 is "+time3);
		
		LocalTime time4 = LocalTime.ofSecondOfDay(600);
		System.out.println("time4 is "+time4);

	}

}
