package tij.chapter15;

import java.util.ArrayList;

/**
 * class_name: Shelf
 * package: tij.chapter15
 * describe: 填充数据
 * creat_user: haoxiaol
 * creat_date: 2018/8/17
 * creat_time: 14:53
 **/
public class Shelf extends ArrayList<Product> {

    //返回一个拥有多个产品的list
    public Shelf(int nProducts) {

        ArrayList<Product> t = new ArrayList<>();
        while (nProducts > 0) {

            t.add(Product.ge.next());
            nProducts--;
        }
        Generators.fill(this, t, 1);
    }
}
