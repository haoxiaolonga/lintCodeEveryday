package tij.chapter13;

/**
 * class_name: IntegerMatch
 * package: tij.chapter13
 * describe: 字符匹配-正则
 * creat_user: haoxiaol
 * creat_date: 2018/8/14
 * creat_time: 14:29
 **/
public class IntegerMatch {


    public static void main(String[] args) {
        System.out.println("-123".matches("-?\\d+"));
        System.out.println("+991".matches("([-+])?\\d+"));
    }

}
