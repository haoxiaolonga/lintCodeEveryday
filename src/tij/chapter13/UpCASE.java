package tij.chapter13;

/**
 * class_name: UpCASE
 * package: tij.chapter13
 * describe: String是不可变对象，每次改变值都是COPY一份新对象
 * creat_user: haoxiaol
 * creat_date: 2018/8/14
 * creat_time: 11:23
 **/
public class UpCASE {
    public static void main(String[] args) {
        String x = "hello ";

        String y = x.toUpperCase();

        System.out.println(x);
        System.out.println(y);
    }
}
