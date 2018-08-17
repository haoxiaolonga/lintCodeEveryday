package tij.chapter15;

import java.util.*;

/**
 * class_name: Generators
 * package: tij.chapter15
 * describe: 构造器
 * creat_user: haoxiaol
 * creat_date: 2018/8/17
 * creat_time: 11:19
 **/
public class Generators {

    public static <T> Collection<T> fill(Collection<T> coll, Collection<T> res, int n) {

        for (int i = 0; i < n && i < res.size(); i++) {
            coll.addAll(res);
        }
        return coll;
    }

    //练习13
    public static <T> List<T> fill(List<T> r, List<T> c, int n) {
        for (T t : c) {
            r.add(t);
        }
        return r;
    }


    public static void main(String[] args) {
        Collection<String> t = fill(New.<String>list(), Arrays.asList("12,34,5"), 1);
        for (String k : t) {
            System.out.println(k);
        }

        List<Integer> t2 = fill(new ArrayList<Integer>(), new LinkedList<Integer>(), 1);
        for (Integer g : t2) {
            System.out.println(g);
        }

    }

}
