package tij.chapterten;

/**
 * class_name: ImplInterfaceInner
 * package: tij.chapterten
 * describe: 接口内部类的类都是嵌套类
 * creat_user: haoxiaol
 * creat_date: 2018/8/9
 * creat_time: 10:06
 **/
public interface ImplInterfaceInner {

    void f();

    //自动前缀为public  static ,
    class Test implements ImplInterfaceInner {

        @Override
        public void f() {
            System.out.println("接口内部类--嵌套类实现接口方法");
        }

        public static void main(String[] args) {
            new Test().f();
        }

    }

}
