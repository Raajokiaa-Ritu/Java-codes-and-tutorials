
package DateAndTimeAPI;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo {
    public static void main(String[] args) {
        Date d = new Date();
        System.out.println("Date : "+d);
        
        DateFormat df = new SimpleDateFormat("dd/MM/YYYY");
        String currentDate = df.format(d);
        System.out.println("Date : "+currentDate);
    }
    
}
