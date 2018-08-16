package tij.chapter15;

/**
 * class_name: Exersice3
 * package: tij.chapter15
 * describe: 练习3---集成元组
 * creat_user: haoxiaol
 * creat_date: 2018/8/16
 * creat_time: 15:30
 **/
public class Exersice3<A, B, C> extends TwoTuple<A, B> {

    public final C c;

    public Exersice3(A a, B b, C c) {
        super(a, b);
        this.c = c;
    }

    public String toString() {
        return a + "," + b + "," + c;
    }

    public static void main(String[] args){
        Exersice3<Integer,Double,String> t = new Exersice3<>(1,2.5,"你好");
        System.out.println(t.toString());
//        即便是public 由于final属性修饰，所以属性不可修改
//        t.c ="x";
    }

}
