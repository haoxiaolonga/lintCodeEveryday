package tij.chapter13;

import java.util.Arrays;
import java.util.regex.Pattern;

/**
 * class_name: SpliteDemo
 * package: tij.chapter13
 * describe: Patten切割字符串
 * creat_user: haoxiaol
 * creat_date: 2018/8/14
 * creat_time: 16:14
 **/
public class SpliteDemo {

    public static void  main(String[] args) {
        String input = "This!!unusual use!!of exclamation!!points";
        Pattern p = Pattern.compile("!!");

        //用pattern的正则切割
        String[] arr = p.split(input);
        for(String t : arr) {
            System.out.println(t);
        }
        //两种不懂切割的方式
        System.out.println(Arrays.toString(p.split(input,3)));
        System.out.println(Arrays.toString(input.split("!!",3)));


    }
}
