package java8;

import java.text.DateFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Date;

/**
*@ClassName DateApi
*@Description  新增时间特性api
*@Author haoxl
*@Date 2019/7/24 14:44
*/
public class DateApi {


    //旧版时间的问题：
    //  1.非线程安全 − java.util.Date 是非线程安全的
    //  2.设计很差 − Java的日期/时间类的定义并不一致，在java.util和java.sql的包中都有日期类
    //  用于格式化和解析的类在java.text包中定义

    // 3.时区处理麻烦 − 日期类并不提供国际化，没有时区支持，因此Java引入了java.util.Calendar和java.util.TimeZone类
    public static void main(String[] args) {

        // 获取当前的日期时间
        LocalDateTime currentTime = LocalDateTime.now();
        System.out.println("当前时间: " + currentTime);

        LocalDate date1 = currentTime.toLocalDate();
        System.out.println("date1: " + date1);

        Month month = currentTime.getMonth();
        int day = currentTime.getDayOfMonth();
        int seconds = currentTime.getSecond();

        System.out.println("月: " + month +", 日: " + day +", 秒: " + seconds);

        LocalDateTime date2 = currentTime.withDayOfMonth(10).withYear(2012);
        System.out.println("date2: " + date2);

        // 12 december 2014
        LocalDate date3 = LocalDate.of(2014, Month.DECEMBER, 12);
        System.out.println("date3: " + date3);

        // 22 小时 15 分钟
        LocalTime date4 = LocalTime.of(22, 15);
        System.out.println("date4: " + date4);

        // 解析字符串
        LocalTime date5 = LocalTime.parse("20:15:30");
        System.out.println("date5: " + date5);

        //转换
        Date date = Date.from(LocalDateTime.now().atZone(ZoneId.systemDefault()).toInstant());

        LocalDateTime x = LocalDateTime.ofInstant(date.toInstant(), ZoneId.systemDefault());
        LocalDate y = x.toLocalDate();
        LocalTime z = x.toLocalTime();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate da = LocalDate.parse("2019-12-10",formatter);

        System.out.println(da);
    }

}
