package tij.chapterten;

/**
 * class_name: InheritInner
 * package: tij.chapterten
 * describe: test继承内部类
 * creat_user: haoxiaol
 * creat_date: 2018/8/9
 * creat_time: 11:19
 **/
public class InheritInner extends WithInner.Inner{


    //此处必须声明继承类所在外部类的构造器  ，否则编译器报编译错误
    InheritInner(WithInner wi){
        wi.super();
    }

    public static void main(String[] args) {
        WithInner wi = new WithInner();
        InheritInner in = new InheritInner(wi);
    }


}
