package com.fh.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class XDateUtil {
    public static final String Y_M_D = "yyyy-MM-dd";
    public  static final String YMD_HMS="yyyy-MM-dd HH:mm:ss";
    public  static  String  DateTurnStr(Date date,String str){
        SimpleDateFormat format = new SimpleDateFormat(str);
        String format1 = format.format(date);
        return  format1;
    }
    public  static Date StrTurnDate(String date,String pattern){
        SimpleDateFormat dateFormat = new SimpleDateFormat(pattern);
        try {
            Date date1 = dateFormat.parse(date);
            return  date1;
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return  null;
    }
}