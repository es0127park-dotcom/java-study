package ex08;

import java.util.Calendar;

public class CalendarTest {
    public static void main(String[] args) {
        Calendar d = Calendar.getInstance();
        System.out.println(d);
        System.out.println(d.get(Calendar.YEAR)+"년");
        System.out.println(d.get(Calendar.MONTH)+ 1 + "월");
        System.out.println(d.get(Calendar.DATE)+"일");

        d.set(Calendar.HOUR, 12);
        d.set(Calendar.MINUTE, 34);
        d.set(Calendar.SECOND, 0);
        System.out.println(d);
        System.out.println(d.get(Calendar.HOUR) + "시 " + d.get(Calendar.MINUTE) + "분 " + d.get(Calendar.SECOND) + "초");
    }
}
