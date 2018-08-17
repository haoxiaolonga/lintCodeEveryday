package tij.chapter15;

import java.util.ArrayList;

/**
 * class_name: Store
 * package: tij.chapter15
 * describe: 店铺
 * creat_user: haoxiaol
 * creat_date: 2018/8/17
 * creat_time: 15:05
 **/
public class Store extends ArrayList<Aisle> {

    private ArrayList<CheckOutStand> check = new ArrayList();

    private Office off = new Office();

    public Store(int snum, int anum, int fnum) {
        while (snum > 0) {
            add(new Aisle(anum, fnum));
            snum--;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        this.forEach(a -> {  //店铺里面是aisle
            a.forEach(f -> {  //aisle里面是shelf
                f.forEach(p -> { //shelf是产品
                    sb.append(p);
                    sb.append("\n");
                });
            });
        });

        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(new Store(2, 3, 4));
    }

}
