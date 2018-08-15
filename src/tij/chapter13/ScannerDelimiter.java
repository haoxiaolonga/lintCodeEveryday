package tij.chapter13;

import java.util.Scanner;

/**
 * class_name: ScannerDelimiter
 * package: tij.chapter13
 * describe: 定界符-测试
 * creat_user: haoxiaol
 * creat_date: 2018/8/15
 * creat_time: 11:08
 **/
public class ScannerDelimiter {

    public static void main(String[] args) {
        Scanner in  = new Scanner("12, 12, 123, 324,213");
        in.useDelimiter("\\s*,\\s*");
        while (in.hasNextInt()) {
            System.out.println(in.nextInt());
        }
        System.out.println(in.delimiter());
    }
}
