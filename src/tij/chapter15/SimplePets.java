package tij.chapter15;

import java.util.List;
import java.util.Map;

/**
 * class_name: SimplePets
 * package: tij.chapter15
 * describe: 简单测试泛型对象当做参数传递是为OBJECT
 * creat_user: haoxiaol
 * creat_date: 2018/8/17
 * creat_time: 11:06
 **/
public class SimplePets {

    public static void f(Map<String, List<? extends Number>> t) {

        System.out.println(t);
    }

    public static void main(String[] args){

        //类型参数，在传递是是不能识别的
        f(New.map());
        //练习12 -- 提示错误
//        f(New.<String,List<Number>>map());

    }


}
