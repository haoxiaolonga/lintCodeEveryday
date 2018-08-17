package tij.chapter15;

import java.util.ArrayList;

/**
 * class_name: Aisle
 * package: tij.chapter15
 * describe: 拥有多个shelf的list
 * creat_user: haoxiaol
 * creat_date: 2018/8/17
 * creat_time: 15:00
 **/
public class Aisle extends ArrayList<Shelf> {

    public Aisle(int n, int m) {
        while (n > 0) {
            //添加几个shelf对象
            add(new Shelf(m));
            n--;
        }
    }

}
