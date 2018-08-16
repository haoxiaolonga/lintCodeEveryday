package tij.chapter15;

/**
 * class_name: TwoTuple
 * package: tij.chapter15
 * describe: 二维元组（持有多个类型的对象）
 * creat_user: haoxiaol
 * creat_date: 2018/8/16
 * creat_time: 14:44
 **/
public class TwoTuple<A, B> {
    public final A a;
    public final B b;

    public TwoTuple(A a, B b) {
        this.a = a;
        this.b = b;
    }

    public String toString() {
        return a + "," + b;
    }
}
