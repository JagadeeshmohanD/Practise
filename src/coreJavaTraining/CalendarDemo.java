package coreJavaTraining;

import java.text.SimpleDateFormat;
import java.util.Calendar;


public class CalendarDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat sd = new SimpleDateFormat();
		System.out.println(sd.format(cal.getTime()));
		System.out.println(cal.get(Calendar.DAY_OF_MONTH));
		System.out.println(cal.get(Calendar.DAY_OF_WEEK));
		System.out.println(cal.get(Calendar.DAY_OF_YEAR));
		System.out.println(cal.get(Calendar.MINUTE));
		

	}

}
