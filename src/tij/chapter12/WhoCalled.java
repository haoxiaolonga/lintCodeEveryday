package tij.chapter12;

/**
 * class_name: WhoCalled
 * package: tij.chapter12
 * describe: 测试栈轨迹，如何调用的
 * creat_user: haoxiaol
 * creat_date: 2018/8/13
 * creat_time: 17:11
 **/
public class WhoCalled {

    public static void f() {
        try {
            try {
                throw new Exception();
            } catch (Exception e) {

                //从内到外--》一层一层记录，栈先进后出 ，栈顶即为最内层方法

                //catch中还可以再抛出异常，异常会将原异常完整的抛出去，
                //如若想从当前位置抛出异常就--执行e.fillInStackTrace()
                // 从当前开始 throw  Exception(e.fillInStackTrace())
                for (StackTraceElement s : e.getStackTrace()) {
                    System.out.println(s.getMethodName());
                }
//                throw e;
                MyException myexception= new MyException();
                myexception.initCause(new NullPointerException());
                throw myexception;

            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    static void g() {
        f();
    }

    static void h() {
        g();
    }

    public static void main(String[] args) {
        System.out.println("第一个");
        f();
        System.out.println("第2个");
        g();
        System.out.println("第3个");
        h();
    }

}
