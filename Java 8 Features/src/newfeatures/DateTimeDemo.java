package newfeatures;

import java.time.Clock;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class DateTimeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Legacy class to deal with date & time which is now deprecated
		
		Date d1=new Date();
		System.out.println(d1);
		System.out.println(d1.getDate());
		System.out.println(d1.getHours()+""+d1.getMinutes());
		
		//Calender Class
		
	Calendar cal =Calendar.getInstance();
	System.out.println(cal.getTime());
	
	
	System.out.println("***************java 8 date &time*********************");
	LocalDate d=LocalDate.now();
	LocalTime t=LocalTime.now();
	
	LocalDateTime dt=LocalDateTime.now();
	
	System.out.println("Date&Time:"+d+"--->"+t);
	
	System.out.println("Before formatting :"+dt);
	
	LocalDateTime dt2=dt.minusDays(100);
	System.out.println(dt2);
	
	LocalDateTime dt3=dt.plusDays(100);
	System.out.println(dt3);
	
	
	DateTimeFormatter format= DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
	String dt1=dt.format(format);
	
	
	System.out.println("After Formatting"+dt1);
	
	
	//Java Clock class is used to provide an access to the current, 
	//date and time using a time zone.
	
	Clock c1=Clock.systemDefaultZone();
	System.out.println(c1.getZone());
	
	
		

	}

}
