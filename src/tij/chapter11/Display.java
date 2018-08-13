package tij.chapter11;

import java.util.*;

/**
 * class_name: Display
 * package: tij.chapter11
 * describe: Iterator 遍历序列，无关序列的底层结构。
 * creat_user: haoxiaol
 * creat_date: 2018/8/13
 * creat_time: 11:23
 **/
public class Display {

    public static void display(Iterator<Integer> it){

        while (it.hasNext()) {
            Integer num = it.next();
            System.out.println(num);
            num++;
        }

    }
    public static void main(String[] args) {

        ArrayList<Integer> t1 = new ArrayList<Integer>();
        t1.addAll(Arrays.asList(new Integer[]{1, 2, 3, 4, 5}));
        LinkedList<Integer> t2 =  new LinkedList<Integer>(t1);
        HashSet<Integer> r3 = new HashSet<Integer>(t1);
        TreeSet<Integer> r4 = new TreeSet<Integer>(t1);

        display(t1.iterator());

        display(t2.iterator());

        display(r3.iterator());

        display(r4.iterator());

    }
}
