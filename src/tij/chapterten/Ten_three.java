package tij.chapterten;

/**
 * class_name: Ten_three
 * package: tij.chapterten
 * describe: 测试内部类返回外部类引用
 * creat_user: haoxiaol
 * creat_date: 2018/8/8
 * creat_time: 10:45
 **/
public class Ten_three {

    void f(){
        System.out.println("我是外部类的打印方法");
    }

    // 内部类--
    class Inner{

        //内部类返回外部类引用----类.this的方式
        public Ten_three outer(){
            return Ten_three.this;
        }
    }

    public static void main(String[] args) {
        Ten_three test = new Ten_three();
        Ten_three.Inner inner  = test.new Inner();

        //返回外部类引用调用外部类的方法
        inner.outer().f();


    }

}
