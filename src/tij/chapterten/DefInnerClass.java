package tij.chapterten;

/**
 * class_name: DefInnerClass
 * package: tij.chapterten
 * describe: 定义内部类的几种方式
 * creat_user: haoxiaol
 * creat_date: 2018/8/8
 * creat_time: 10:54
 **/
public class DefInnerClass {

    private int num;

    //1.直接定义属性
    class InnerClass1{
        void f(){
            System.out.println("直接定义内部类为属性");
        }
    }

    public void testF(){

        class InnerClass2{  //此处可以实现一个接口或者扩展一个类，返回基类对象
            void f(){
                System.out.println("定义到方法中的内部类");
            }
        }
        InnerClass2 a = new InnerClass2();
        a.f();
//        return  XXX 返回内部类的对象，向上转型
    }

    private class AAA implements Face{

        public void f(){
            System.out.println("我是实现接口类的打印方法");
        }
    }

    //向上转型
    public Face getParent(){

        return  new AAA();
    }

    public static void main(String[] args) {

        DefInnerClass d = new DefInnerClass();
        Face a = d.getParent();
        AAA b = (AAA) a;   //向下转型
        b.f();
    }


}
