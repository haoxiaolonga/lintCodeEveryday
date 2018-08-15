package tij.chapter13;

import java.io.StringReader;
import java.util.Scanner;

/**
 * class_name: Exercise20
 * package: tij.chapter13
 * describe: 练习20--scanner扫描输入
 * creat_user: haoxiaol
 * creat_date: 2018/8/15
 * creat_time: 10:42
 **/
public class Exercise20 {
    String str;
    int i;
    double d;
    long l;
    float f;

    /**
     * method_name: Exercise20
     * param: [input]
     * param:
     * describe: 构造器，扫描input为各个属性赋值
     * creat_user: haoxiaol
     * creat_date: 2018/8/15
     * creat_time: 11:03
     **/
    public Exercise20(String input) {
        Scanner in = new Scanner(new StringReader(input));
        while (in.hasNext()) {
            i = in.nextInt();
            d = in.nextDouble();
            l = in.nextLong();
            f = in.nextFloat();
            str = in.next();
        }

    }

    public String toString() {

        return str + "  " + i + "  " + d + "  " + l + "  " + f;
    }

    public static void main(String[] args) {
        Exercise20 t = new Exercise20("10 2.22 1 2.0 sdhjkfhsdkf");
        System.out.println(t.toString());
    }

}
