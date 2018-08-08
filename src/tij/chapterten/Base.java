package tij.chapterten;

/**
 * class_name: Base
 * package: tij.chapterten
 * describe: 抽象基类
 * creat_user: haoxiaol
 * creat_date: 2018/8/8
 * creat_time: 16:00
 **/
abstract class Base {

    private int num;

    public Base(int i) {
        System.out.println("参数位i = " + i);
    }

    public abstract void f();
}
