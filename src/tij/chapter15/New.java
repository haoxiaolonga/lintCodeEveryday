package tij.chapter15;

import java.util.*;

/**
 * class_name: New
 * package: tij.chapter15
 * describe: 工具类--返回泛型的容器
 * creat_user: haoxiaol
 * creat_date: 2018/8/17
 * creat_time: 10:59
 **/
public class New {

    public static <K,V> Map<K,V> map(){

        return new HashMap<K,V>();
    }

    public static <T> List<T> list(){

        return new ArrayList<T>();
    }

    public static <T> LinkedList<T> linkedList(){

        return new LinkedList<T>();
    }

    public static <T> Set<T> set(){

        return new HashSet<T>();
    }
    public static void main(String[] args){

        List<String> t = New.list();

    }

}
