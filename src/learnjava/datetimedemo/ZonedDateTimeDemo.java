package learnjava.datetimedemo;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;

public class ZonedDateTimeDemo {

	public static void main(String[] args) {

		ZonedDateTime zonedDateTime = ZonedDateTime.now();
		System.out.println("Current time is "+zonedDateTime);

		ZoneId zoneId = ZoneId.of("GMT+2");
//		System.out.println("Current Paris time is "+zonedDateTime);
		
		ZoneId parisZoneId = ZoneId.of("Europe/Paris");
		zonedDateTime = ZonedDateTime.now(parisZoneId);
		System.out.println("Current Paris time is "+zonedDateTime);
		
		parisZoneId = ZoneId.ofOffset("GMT", ZoneOffset.of("+02:00"));
		zonedDateTime = ZonedDateTime.now(parisZoneId);
		System.out.println("Current Paris time is "+zonedDateTime);
		
		parisZoneId = ZoneId.of("GMT+2");
		zonedDateTime = ZonedDateTime.now(parisZoneId);
		System.out.println("Current Paris time is "+zonedDateTime);
		
//		LocalDateTime date = LocalDateTime.of(2013,5,19,12,30);
		LocalDateTime date = LocalDateTime.now();
		zonedDateTime = ZonedDateTime.of(date, parisZoneId);
		System.out.println("Paris time is "+zonedDateTime);
		
		
	}

}
