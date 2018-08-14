package tij.chapter13;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * class_name: Exercise10
 * package: tij.chapter13
 * describe: 联系11
 * creat_user: haoxiaol
 * creat_date: 2018/8/14
 * creat_time: 15:24
 **/
public class Exercise11 {

    public static void main(String[] args) {

        //元音结尾。空白或者元音开始（？i不知道是啥）
        String reg = "(?i)((^[aeiou])|(\\s+[aeiou]))\\w+?[aeiou]\\b";
        Pattern p = Pattern.compile(reg);
        Matcher m = p.matcher("Arline ate eight apples and one orange while anita hadn't any");
        while(m.find()){
            System.out.println(m.group());
        }

        //注释：/*、
        // find()可以在输入的任意位置定位正则表达式  lookingAt()和matches()要求从输入最开始
        //地方开始就匹配。matches是整个输入都必须满足，lookingAt是输入的第一部分满足就行
        // */

    }
}
