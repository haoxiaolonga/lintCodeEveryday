package tij.chapterten;

/**
 * class_name: Mna
 * package: tij.chapterten
 * describe: 多重嵌套内部类--内部类嵌套多少次不影响--内部类访问外围类的所有成员
 * creat_user: haoxiaol
 * creat_date: 2018/8/9
 * creat_time: 10:22
 **/
public class Mna {

    private void f(){
        System.out.println("我是第一层的私有方法");
    }

    class Two {
        private void g() {
            System.out.println("我是第二层的私有方法");
        }

        class Three {
            private void h() {
                System.out.println("我是第三层的私有方法");

                //可以访问外围类的方法，但是不可用对象点方法的形式,即使是私有方法也可访问
                g();
                f();
            }


        }
    }
    public static void main(String[] args) {
        Mna a = new Mna();
        Mna.Two t = a.new Two();


        //注意外围类可以直接看到一层的内部类，第二层的就必须用外围类.内部类的形式
        Two.Three h = t.new Three();
        h.h();

        System.out.println(System.nanoTime());

    }





}
