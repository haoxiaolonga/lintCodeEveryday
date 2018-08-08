package tij.chapterten;

/**
 * class_name: AnonymousConstructor
 * package: tij.chapterten
 * describe: 实力初始化--匿名内部类属性
 * creat_user: haoxiaol
 * creat_date: 2018/8/8
 * creat_time: 16:12
 **/
public class AnonymousConstructor {
    public static Base getBase(int i) {
        return new Base(i) {
            private int x;
            {
                System.out.println("实例初始化");
                x = i;
            }

            @Override
            public void f() {
                System.out.println("实现抽象方法");
                System.out.println(x);
            }
        };
    }

    public static void main(String[] args) {
        Base base = getBase(47);
        base.f();
    }

}
