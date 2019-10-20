package learnjava.datetimedemo;

import java.time.LocalDate;
import java.time.LocalTime;

public class LocalTimeArithmeticDemo {

	public static void main(String[] args) {
		LocalTime time1 = LocalTime.parse("10:30");
		System.out.println("Time is "+time1);
		
		LocalTime time2 = time1.plusHours(2);//add 2 hours
		System.out.println("Plus 2 hours is "+time2);
		
		time2 = time1.plusSeconds(90);//add 90 seconds 
		System.out.println("Plus 90 secs is "+time2);
		
		time2 = time1.minusMinutes(10); //subtract 10 minutes
		System.out.println("Minus 10 minutes is "+time2);
		
		time2 = time1.minusHours(3); //subtract 3 hours
		System.out.println("Minus 3 hours is "+time2);
		
		time2 = time1.withHour(8);//year set to 8
		System.out.println("With hours set to 8 is "+time2);
		
		time2 = time1.withMinute(45);//minutes set to 45
		System.out.println("With minutes set to 45 is "+time2);

	}

}
