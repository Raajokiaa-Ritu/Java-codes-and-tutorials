
package DateAndTimeAPI;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class TimeDemo {
    public static void main(String[] args) {
        LocalTime t = LocalTime.now();
        System.out.println("Time : "+t);
        DateTimeFormatter f = DateTimeFormatter.ofPattern("hh:mm:ss");
        String tf = t.format(f);
        System.out.println("time : "+tf);
    }
}
