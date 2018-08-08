package tij.chapterten;

/**
 * class_name: Outer
 * package: tij.chapterten
 * describe: 内部类测试
 * creat_user: haoxiaol
 * creat_date: 2018/8/8
 * creat_time: 10:24
 **/
public class Outer {

    private String a;

    public Outer() {
        this.a = "hello";
    }

    class Inner {
        public void pf() {
            System.out.println("我是内部类的方法" + a);  //内部累可以访问外部内所有属性
        }
    }

    public Inner getInnerClass() {
        return new Inner();
    }

    public void notStaticMethod() {
        Outer.Inner obj = new Inner();   //可以为
        Inner obj2 = new Inner();    //两种方式都可以
        obj.pf();
    }


    public static void main(String[] args) {

        Outer out = new Outer();
        Inner obj = out.new Inner();  //static 方法中必须用外部类new出内部类
//        obj.pf();
        out.notStaticMethod();
    }
}
