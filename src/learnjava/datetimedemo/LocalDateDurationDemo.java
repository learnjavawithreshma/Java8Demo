package learnjava.datetimedemo;

import java.time.LocalDate;
import java.time.Period;

public class LocalDateDurationDemo {

	public static void main(String[] args) {
		LocalDate date1 = LocalDate.parse("2017-05-17");
		LocalDate date2 = LocalDate.parse("2017-08-17");
		Period period = date1.until(date2);
		System.out.println("Duration between "+date1+" and "+date2+" is "+  period.getMonths()+" months");

	}

}
