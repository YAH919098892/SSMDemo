package util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DayUtil {
    public static Date getDay(String day) throws ParseException {
        SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date=null;
        date=dateFormat.parse(day);
        return date;
    }
}
