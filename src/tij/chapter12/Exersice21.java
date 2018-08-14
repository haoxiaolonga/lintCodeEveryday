package tij.chapter12;

/**
 * class_name: Exersice21
 * package: tij.chapter12
 * describe: 证明派生类不能捕获基类的异常
 * creat_user: haoxiaol
 * creat_date: 2018/8/14
 * creat_time: 10:22
 **/
public class Exersice21 extends Exersice21_1 {

    public Exersice21() throws NoSuchFieldException, NullPointerException {
        super();
        throw new NoSuchFieldException();
    }


    public static void main(String[] args) {
        try {
            Exersice21 tt = new Exersice21();
        } catch (NoSuchFieldException e) {
            System.out.println(e);
        } catch (NullPointerException e1) {
            System.out.println("空");
        } finally {
            System.out.println(1);
            ;
        }

    }


}
