package tij.chapter13;

import java.util.Scanner;

/**
 * class_name: Exercise7
 * package: tij.chapter13
 * describe: 练习7--编写一个正则，匹配大写字母开始，句号结尾的字符串
 * creat_user: haoxiaol
 * creat_date: 2018/8/14
 * creat_time: 14:39
 **/
public class Exercise7 {

    /**
     * method_name: main
     * param: [args]
     * param: void
     * describe: 匹配大写字母开始，.结尾的正则
     * creat_user: haoxiaol
     * creat_date: 2018/8/14
     * creat_time: 14:58
     **/
    public static void main(String[] args) {

        while (true) {
            Scanner in = new Scanner(System.in);
            String temp = in.next();
            System.out.println(temp.matches("[A-Z](.*)\\."));
        }

    }
}
