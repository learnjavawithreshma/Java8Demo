package learnjava.datetimedemo;

import java.time.Clock;
import java.time.LocalDate;

public class LocalDateDemo {

	public static void main(String[] args) {
		LocalDate date1 = LocalDate.now();
		System.out.println("Today's date is "+date1);
		
		LocalDate date2 = LocalDate.parse("2019-07-15");
		System.out.println("Date2 is "+date2);
		
		LocalDate date3 = LocalDate.of(2017,05,17);
		System.out.println("Date3 is "+date3	);
		
		LocalDate date4 = LocalDate.ofYearDay(2017,8);
		System.out.println("Date4 is "+date4);
		
		LocalDate date5 = LocalDate.now(Clock.systemUTC());
		System.out.println("Date5 is "+date5);

	}

}
