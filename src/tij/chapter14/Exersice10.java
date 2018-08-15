package tij.chapter14;

/**
 * class_name: Exersice10
 * package: tij.chapter14
 * describe: 练习10
 * creat_user: haoxiaol
 * creat_date: 2018/8/15
 * creat_time: 15:42
 **/
public class Exersice10 {

    public static void charIsNotType() {
        char[] t = new char[]{'1'};
        try {
            t.getClass().newInstance();
            System.out.println("是");
        } catch (InstantiationException e) {
            System.out.println("不是");;

        } catch (IllegalAccessException e) {
            System.out.println("是");
        }

        //漏洞，当是对象时，没有显示声明构造函数也会抛错

        //判处array ,标记，枚举，就基本是纯对象


    }

    public static void main(String[] args){
        charIsNotType();
        System.out.println("用class自带方法判断");
        Object o = new Object();
        System.out.println(o.getClass().isArray());
        System.out.println(o.getClass().isPrimitive());
        System.out.println(o.getClass().isEnum());
    }

}
