package JavaDateTime;

import java.util.Calendar;

public class CalendarDemo {
    public static void showCalendar(Calendar c) {
		int year = c.get(Calendar.YEAR);
		int month = c.get(Calendar.MONTH);
		int day = c.get(Calendar.DAY_OF_MONTH);
		int hour = c.get(Calendar.HOUR_OF_DAY);
		int minute = c.get(Calendar.MINUTE);
		int second = c.get(Calendar.SECOND);
		int millis = c.get(Calendar.MILLISECOND);

        System.out.println(" " + year + "-" + (month + 1) + "-" + day //
				+ " " + hour + ":" + minute + ":" + second + " " + millis);
    }

    public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
        showCalendar(c);
        c.set(2020, 0, 1);
        c.roll(Calendar.DATE, 50);
        showCalendar(c);

        Calendar cx = Calendar.getInstance();
        cx.set(2020, 0, 1);
        cx.add(Calendar.DATE, 50);
        showCalendar(cx);


		System.out.println("First calendar info");
		showCalendar(c);

		c.roll(Calendar.HOUR_OF_DAY, true);
		System.out.println("After roll 1 hour");
		showCalendar(c);

		c.roll(Calendar.HOUR_OF_DAY, false);
		System.out.println("After roll -1 hour");
		showCalendar(c);

		c.add(Calendar.HOUR_OF_DAY, 1);
		System.out.println("After add 1 hour");
		showCalendar(c);

		c.roll(Calendar.DAY_OF_MONTH, -30);
		System.out.println("After roll -30 day");
		showCalendar(c);

		c.add(Calendar.DAY_OF_MONTH, 30);
		System.out.println("After add 30 day");
		showCalendar(c);

	}
}
