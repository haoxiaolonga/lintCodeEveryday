package tij.chapter15;

import java.util.ArrayList;
import java.util.List;

/**
 * class_name: GenericVarargs
 * package: tij.chapter15
 * describe: 可变参数和泛型方法
 * creat_user: haoxiaol
 * creat_date: 2018/8/17
 * creat_time: 13:52
 **/
public class GenericVarargs {

    public static <T>  List<T> makeList(T... args) {
        List<T> res = new ArrayList<>();
        for(T t : args) {
            res.add(t);
        }
        return res;
    }

    public static void main(String[] args){
        List<String> str = makeList("A");

        List<Integer> intL = makeList(1,2,3);

        str.forEach((t) -> {
            System.out.println(t);
        });

        intL.forEach((t) -> {
            System.out.println(t);
        });
    }


}
