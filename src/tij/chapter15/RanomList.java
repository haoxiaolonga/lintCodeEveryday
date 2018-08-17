package tij.chapter15;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * class_name: RanomList
 * package: tij.chapter15
 * describe: 随机选取数据
 * creat_user: haoxiaol
 * creat_date: 2018/8/16
 * creat_time: 17:14
 **/
public class RanomList<T> {

    private List<T> arr = new ArrayList<>();

    public Random rand = new Random(47);

    public void add(T t) {
        arr.add(t);
    }


    public T select() {
        return arr.get(rand.nextInt(arr.size()));
    }

    public static void main(String[] args) {

        RanomList<String> t1 = new RanomList<>();
        //练习6 --试试其他类型
        RanomList<Integer> t2 = new RanomList<>();
        RanomList<Float> t3 = new RanomList<>();
        for (int i = 0; i <= 10; i++) {

            t1.add("num" + i);
            t2.add(i);
            t3.add(i * 0.1f);
        }
        System.out.println(t1.select());
        System.out.println(t2.select());
        System.out.println(t3.select());

    }

}
