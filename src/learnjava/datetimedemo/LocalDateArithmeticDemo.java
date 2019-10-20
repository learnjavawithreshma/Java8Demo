package learnjava.datetimedemo;

import java.time.LocalDate;

public class LocalDateArithmeticDemo {
	
	public static void main(String args[]){
		LocalDate date1 = LocalDate.parse("2019-07-15");
		
		//System.out.println("  Date     "+date1);
		
		LocalDate date2 = date1.plusDays(5);//add 5 days
		System.out.println(date1+"    +5 day:     "+date2);
		
		date2 = date1.plusWeeks(2);//add 2 weeks
		System.out.println(date1+"    +2 weeks:   "+date2);
		
		date2 = date1.minusMonths(6);//minus 6 months
		System.out.println(date1+"    -2 months:  "+date2);
		
		date2 = date1.minusYears(4);//minus 4 years
		System.out.println(date1+"    -4 years:   "+date2);
		
		System.out.println("--------------With Operations--------------------");
		
		date2 = date1.withMonth(2);// with month set to February
		System.out.println(date1+"    with Month 2:  "+date2);
		
		date2 = date1.withDayOfMonth(24);// with dayOfMonth set to 24;
		System.out.println(date1+"    with dayOfMonth 24:    "+date2);
		
		date2 = date1.withYear(2014);// with year set to 2014;
		System.out.println(date1+"    with Year 2014  "+date2);
		
		date2 = date1.withDayOfYear(42);// with day of year set to 42;
		System.out.println(date1+"    with DayofYear 42  "+date2);
		
		

	}

//	public static void main(String[] args) {
//	
//	LocalDate date = LocalDate.parse("2019-07-15");
//		
//	LocalDate date2 = date.plusDays(5);//add 5 days
//	System.out.println("Date "+date+" plus 5 days is "+date2);
//	
//	date2 = date.minusMonths(4); //subtract 4 months
//	System.out.println("Date "+date+" minus 4 months is "+date2);
//	
//	date2 = date.plusWeeks(3);
//	System.out.println("Date "+date+" plus 3 weeks is "+date2);
//	
//	date2 = date.withYear(2019);//year set to 2019
//	System.out.println("Date "+date+" with year set to 2019 is "+date2);
//}
//
//	

}
