package JavaDateTime;

import java.util.concurrent.TimeUnit;

public class TimeUnitConvertDemo {

	public static void main(String[] args) {

		// Số giây.
		long second = 130000;

		// Đổi số giây trên sang ngày (Day)
		long day = TimeUnit.DAYS.convert(second, TimeUnit.SECONDS);
		System.out.println("Day " + day);

		// Đổi số giây trên sang giờ.
		long hour = TimeUnit.HOURS.convert(second, TimeUnit.SECONDS);
		System.out.println("Hour " + hour);

		System.out.println("------");

        	// Chuyển đổi 29 giờ sang ngày.
		long days = TimeUnit.HOURS.toDays(29);
		System.out.println("Day " + days);

		// Chuyển đổi 29 ngày sang giờ.
		hour = TimeUnit.DAYS.toHours(29);
		System.out.println("Hour " + hour);
	}

}
