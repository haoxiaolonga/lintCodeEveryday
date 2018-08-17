package tij.chapter15;

import java.util.Random;

/**
 * class_name: Product
 * package: tij.chapter15
 * describe: 产品类
 * creat_user: haoxiaol
 * creat_date: 2018/8/17
 * creat_time: 14:45
 **/
public class Product {

    private final int id;
    private String des;
    private double price;

    public Product(int id, String des, double price) {
        this.id = id;
        this.des = des;
        this.price = price;
        System.out.println(toString());
    }

    public String toString() {
        return "id" + id + " " + "描述：" + des + " " + "单价" + price;
    }

    public void changePrice(double tprice) {
        price += tprice;
    }

    public static Generator<Product> ge = new Generator<Product>() {

        private Random rand = new Random(47);

        @Override
        public Product next() {
            return new Product(rand.nextInt(1000),"test",Math.round(rand.nextDouble()));
        }
    };


}
