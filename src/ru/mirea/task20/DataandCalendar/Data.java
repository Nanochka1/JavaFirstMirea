package ru.mirea.task20.DataandCalendar;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class Data{
public static void main(String[] args) {
        System.out.println(LocalDateTime.now());
        System.out.println();
        System.out.println(ZonedDateTime.now().format(DateTimeFormatter.RFC_1123_DATE_TIME));
        System.out.println();
        Date d = new Date();
        System.out.println(System.currentTimeMillis());
        System.out.println(d);
        System.out.println();
        System.out.println(Calendar.getInstance());
        System.out.println();
        String timeStamp = new SimpleDateFormat("dd. MM. yyyy").format(Calendar.getInstance().getTime());
        System.out.println(timeStamp);
        System.out.println();
        System.out.println( new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(new Date()));
        }
        }