package JavaDateTime;

import java.util.Date;

public class DateDemo {

    public static void main(String[] args) {
        Date date1 = new Date();
        Date date2 = new Date(11, 11, 2021);
        int i = date1.compareTo(date2);
        System.out.println("date1 compareTo date2 = " + i);
    }
}
