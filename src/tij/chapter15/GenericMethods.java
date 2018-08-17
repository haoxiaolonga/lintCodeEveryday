package tij.chapter15;

import java.util.HashMap;
import java.util.Map;

/**
 * class_name: GenericMethods
 * package: tij.chapter15
 * describe: 泛型参数和泛型返回类型
 * creat_user: haoxiaol
 * creat_date: 2018/8/17
 * creat_time: 10:31
 **/
public class GenericMethods {


    public <T> void f(T x) {
        System.out.println("！" + x.getClass().getSimpleName());
    }

    public <T> T F(T x) {

        return x;
    }

    //练习9
    public <T> void g(T x, T y, String c) {

         f(x);
         f(y);
         f(c);
    }

    public static void main(String[] args) {
        GenericMethods t = new GenericMethods();
        t.f(1);
        t.f(2.2);
        t.f("kkkkk");

        System.out.println(t.F(1));
        System.out.println(t.F("kkkk"));

        t.g(1,1.1,"YYY");

        Map<String,String> m = new HashMap<>();
    }
}
