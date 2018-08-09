package tij.chapterten;

/**
 * class_name: testMain
 * package: tij.chapterten
 * describe: 内部类实现main方法
 * creat_user: haoxiaol
 * creat_date: 2018/8/9
 * creat_time: 10:14
 **/
public class testMain {

    void f(){
        System.out.println("我是待测试方法");

    }

    public static class testMethod {

        public static void main(String[] args) {
            new testMain().f();
        }
    }
}
