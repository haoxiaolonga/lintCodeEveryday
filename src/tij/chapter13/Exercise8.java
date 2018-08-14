package tij.chapter13;

/**
 * class_name: Exercise8
 * package: tij.chapter13
 * describe: 利用正则分割字符串
 * creat_user: haoxiaol
 * creat_date: 2018/8/14
 * creat_time: 15:02
 **/
public class Exercise8 {
    //The secret of being miserable is to have leisure to bother about whether you are happy or not.
    //痛苦的秘密在于有闲功夫担心自己是否幸福。

    public static void main(String[] args) {
        String temp = "The secret of being miserable is to have leisure to bother about whether you are happy or not.";

        //正则切割
        String[] arr = temp.split("miserable|happy");
        for(String t : arr) {
            System.out.println(t);
        }
        //正则替换

        temp = temp.replaceAll("[aeuio]","_");
        System.out.println(temp);

    }

}