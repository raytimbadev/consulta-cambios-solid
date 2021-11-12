package mz.co.fnb.manager.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Utils {

    public static String dateFormat(Date date, String dateFormat) {
        SimpleDateFormat format = new SimpleDateFormat(dateFormat);
        return format.format(date);
    }
}
