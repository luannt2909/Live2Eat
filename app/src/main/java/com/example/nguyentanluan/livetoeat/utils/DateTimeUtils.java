package com.example.nguyentanluan.livetoeat.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/**
 * Created by Nguyen Tan Luan on 3/18/2017.
 */

public class DateTimeUtils {
    public static final String FORMAT_DATE_dd= "dd";
    public static final String FORMAT_DATE_MM_yyyy = "MM/yyyy";
    //    public static final String FORMAT_DATE_FROM_SERVER = "yyyy-MM-dd'T'HH:mm:ss.SSSSSSSZZZZZ";
    public static final String FORMAT_DATE_FROM_SERVER = "yyyy-MM-dd'T'HH:mm:ss.SSSZ";
    public static final String FORMAT_DATE_dd_MM_HH_mm= "dd/MM HH:mm";


    public static Date getDateFromString(String source, String format) {
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        try {
            return sdf.parse(source);
        } catch (ParseException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static String getStringFromDate(Date source, String format) {
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        return sdf.format(source);
    }

    public static String getStringFromDate(long date, String format) {
        SimpleDateFormat sdf = new SimpleDateFormat(format, Locale.getDefault());
        return sdf.format(new Date(date));
    }

    public static String getCurrentDate(String format){
        Calendar c = Calendar.getInstance();
        SimpleDateFormat df = new SimpleDateFormat(format);
        String formattedDate = df.format(c.getTime());
        return  formattedDate;
    }
    public static String getTimeZoneString() {
        return "+07:00";
    }
}
