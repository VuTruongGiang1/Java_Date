package JavaDateTime;

public class JobTimeDemo {

	private static int sumInTotal(int count) {
		int total = 0;
		for (int i = 0; i < count; i++) {
			total += i;
		}
		return total;
	}

	public static void main(String[] args) {
		long millis1 = System.currentTimeMillis();

		sumInTotal(100000);

		long millis2 = System.currentTimeMillis();

		long distance = millis2 - millis1;

		System.out.println("Distance time in milli second: " + distance);
	}
}
