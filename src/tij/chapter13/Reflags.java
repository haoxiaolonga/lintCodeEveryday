package tij.chapter13;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * class_name: Reflags
 * package: tij.chapter13
 * describe: 正则标识
 * creat_user: haoxiaol
 * creat_date: 2018/8/14
 * creat_time: 15:56
 **/
public class Reflags {

    public static void main(String[] args) {
        Pattern p = Pattern.compile("^java", Pattern.CASE_INSENSITIVE
                | Pattern.COMMENTS | Pattern.MULTILINE);
        Matcher m = p.matcher(
                "java has reg\nJava has reg\n"
                        + "Java  \n"
                        + "JAVA java ");
       /* String temp = "java now has regular Expressions";
        m = p.matcher(temp);*/

       //在不是多行模式下^和$匹配以什么开始和结束匹配整个字符串，多行模式下就要匹配前缀既满足

        while(m.find()) {
            System.out.println(m.group());
        }
    }
}
