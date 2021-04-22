package tij.chapter16;

import sun.applet.Main;

import java.util.Arrays;

/**
 * class_name: Teste
 * package: tij.chapter16
 * describe:  测试equals
 * creat_user: haoxiaol
 * creat_date: 2018/9/17
// * creat_time: 下午10:48
 **/
public class Teste {

    public static void main(String[] args) {
        System.out.println("a" == "a");
        System.out.println("a".equals("a"));
        System.out.println(new String("a").equals(new String("a")));

        String a = "1";
        String b = "1";

        System.out.println(a == b);
        System.out.println(a.equals(b));
        System.out.println(a.length());


        Integer[] abc = {1,2,3};
        Integer[] bc = new Integer[3];
        Integer[] d = {new Integer(1),new Integer(2), new Integer(3)};
        System.arraycopy(abc,0,bc,0,3);
        System.out.println(abc == bc);
        System.out.println(abc == d);
        System.out.println(bc.equals(d));
        System.out.println(Arrays.equals(bc,d));

    }


}
