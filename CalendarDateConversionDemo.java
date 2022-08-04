package JavaDateTime;

import java.util.Date;
import java.util.concurrent.TimeUnit;
import java.util.Calendar;

public class CalendarDateConversionDemo {
    public static void showCalendar(Calendar c) {
		int year = c.get(Calendar.YEAR);

		// Trả về giá trị từ 0 - 11
		int month = c.get(Calendar.MONTH);
		int day = c.get(Calendar.DAY_OF_MONTH);
		int hour = c.get(Calendar.HOUR_OF_DAY);
		int minute = c.get(Calendar.MINUTE);
		int second = c.get(Calendar.SECOND);
		int millis = c.get(Calendar.MILLISECOND);

		System.out.println(year + "-" + (month + 1) + "-" + day + " " + hour + ":" + minute + ":" + second + " " + millis);
	}

	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();

		// Calendar ==> Date
		c.set(2000, 11, 24);
		Date date = c.getTime();
		System.out.println("Date " + date);
		
		// Date ==> Calendar
		Date date2 = new Date();
		c.setTime(date2);
		showCalendar(c);
	}
}
