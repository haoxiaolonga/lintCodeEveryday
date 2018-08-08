package tij.chapterten;

/**
 * class_name: NoNameClass
 * package: tij.chapterten
 * describe: 匿名内部类
 * creat_user: haoxiaol
 * creat_date: 2018/8/8
 * creat_time: 11:17
 **/
public class NoNameClass {


    //实现接口形式
    public Face kkk(){
        return new Face(){
           public void f(){
               System.out.println("我是匿名内部类实现的接口打印方法");

           }
        };
    }

    //实现带参构造器
    public Wapping wapping(int x){
        //实际就像是 继承 扩展基类
        return new Wapping(x){

            //不知为何，定义的方法没用，外部依旧访问的基类的方法

            void f(){
                System.out.println("我是匿名内部类--父类带参数打印");
                System.out.println(super.getInt() * 10);
            }

            int getint(){
                return super.getInt() * 10;
            }

        };
    }

    public Face testFinal(String a){
        return new Face() {
            @Override
            public void f() {

            }

            private  String at = a;
        };
    }


    public static void main(String[] args){

        NoNameClass no = new NoNameClass();

        Face g = no.kkk();
        g.f();

        Wapping w = no.wapping(5);
        System.out.println(w.getInt());
//        w.
        Face A = no.testFinal("123");


    }

}
