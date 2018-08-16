package tij.chapter15;

/**
 * class_name: Holder
 * package: tij.chapter15
 * describe: 练习2
 * creat_user: haoxiaol
 * creat_date: 2018/8/16
 * creat_time: 14:31
 **/
public class Holder<T> {

    private T a;

    private T b;

    private T c;

    public Holder(T a, T b, T c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void setA(T a) {
        this.a = a;
    }

    public T getA(){
        return a;
    }

    public void setB(T b) {
        this.b = a;
    }

    public T getB(){
        return b;
    }

    public void setC(T c) {
        this.c = c;
    }

    public T getC(){
        return c;
    }

    public static void main(String[] args){

        //泛型决定了类型下所有的泛型一致
        Holder<Integer> h = new Holder<Integer>(1,2,3);
    }


}
