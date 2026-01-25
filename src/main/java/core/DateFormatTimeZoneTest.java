package main.java.core;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;


public class DateFormatTimeZoneTest {
	
	public static void main(String[] args) {
		Locale locale = Locale.getDefault();
		System.out.println("Default Locale = " + locale);
		
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMM-yyyy", locale);
		System.out.println("Date before applying time zone = " + dateFormat.format(new Date()));
		
		dateFormat.setTimeZone(TimeZone.getTimeZone("PST"));
		System.out.println("Date after applying time zone = " + dateFormat.format(new Date()));
	}

}  