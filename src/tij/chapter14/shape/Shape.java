package tij.chapter14.shape;

/**
 * class_name: Shape
 * package: tij.chapter14.shape
 * describe: 抽象基类--形状
 * creat_user: haoxiaol
 * creat_date: 2018/8/15
 * creat_time: 14:40
 **/
abstract class Shape {
    void draw() {
        System.out.println(this + "draw（）");
    }

    //强制要求后代实现抽象方法
    public abstract String toString();



}
