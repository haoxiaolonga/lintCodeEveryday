package tij.chapter15;

import java.util.ArrayList;
import java.lang.String;

/**
 * class_name: compareFnaxing
 * package: tij.chapter15
 * describe: 比较泛型class
 * creat_user: haoxiaol
 * creat_date: 2018/8/17
 * creat_time: 15:27
 **/
public class compareFnaxing {
    public static void main(String[] args) {
        Class T1 = new ArrayList<Integer>().getClass();
        Class T2 = new ArrayList<String>().getClass();

//        类型不同，但是此次会返回true都是ArrayList????
        //结论、:在泛型代码内部--无法获得有关泛型参数类型的信息
        //例如 LIST<sTRING> 和List<Integer>运行时为一个类型-
        // 都会被擦除泛型--展示其原始类型---LIST
        System.out.println(T1 == T2);
    }
}
