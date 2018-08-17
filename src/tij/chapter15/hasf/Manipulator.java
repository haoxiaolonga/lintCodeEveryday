package tij.chapter15.hasf;

/**
 * class_name: Manipulator
 * package: tij.chapter15.hasf
 * describe: 测试类
 * creat_user: haoxiaol
 * creat_date: 2018/8/17
 * creat_time: 15:46
 **/
public class Manipulator<T extends HasF> {

    private T t;

    public Manipulator(T t) {
        this.t = t;
    }

    public void manipulate(){

        //必须先声明T继承自hasF，不然找不到F()的
        t.f();
    }

}
