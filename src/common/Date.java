package common;

import java.util.Calendar;

public class Date {
	
	public static void main(String[] args) {
		
        Calendar cal = Calendar.getInstance();
        //cal.setTime(getExpirationDate());
        cal.set(cal.HOUR_OF_DAY, 0);
        cal.set(cal.MINUTE, 0);
        cal.set(cal.SECOND, 0);
        cal.set(cal.MILLISECOND, 0);
     
	}

}
