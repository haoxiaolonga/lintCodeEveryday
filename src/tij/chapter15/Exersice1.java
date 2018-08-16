package tij.chapter15;

/**
 * class_name: Exersice1
 * package: tij.chapter15
 * describe: 练习1---泛型对象--持有基类，可以持有其导出类
 * creat_user: haoxiaol
 * creat_date: 2018/8/16
 * creat_time: 14:24
 **/
public class Exersice1<T> {
    private T a;

    public Exersice1(T a) {
        this.a = a;
    }

    public void set(T x) {
        this.a = x;
    }

    public T get() {
        return a;
    }

    public static void main(String[] args){

        Exersice1<Parent> t = new Exersice1<Parent>(new Parent());
        //基类泛型可以使用导出类
        t.set(new Son());

        Exersice1<Son> tt = new Exersice1<>(new Son());
        //导出类的泛型，不可再设置为基类
//        tt.set(new Parent());

    }

}
