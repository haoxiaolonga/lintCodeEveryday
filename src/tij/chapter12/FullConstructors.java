package tij.chapter12;

/**
 * class_name: FullConstructors
 * package: tij.chapter12
 * describe: 自定义异常测试
 * creat_user: haoxiaol
 * creat_date: 2018/8/13
 * creat_time: 15:34
 **/
public class FullConstructors {

    public static void f() throws MyException {

        System.out.println("throwing exception from f() -- 无参数");
        throw new MyException();
    }

    public static void g() throws MyException {

        System.out.println("throwing exception from g() -- 带参数");
        throw new MyException("我是带参数的");
    }

    public static void main(String[] args) {

        try {
            f();
        } catch (MyException e) {
            System.out.println("F方法抛出异常");
            e.printStackTrace();
        }

        try {
            g();
        } catch (MyException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }  finally {
            System.out.println("都会执行的方法");
        }

    }

}
