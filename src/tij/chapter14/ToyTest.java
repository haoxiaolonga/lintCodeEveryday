package tij.chapter14;

/**
 * class_name: ToyTest
 * package: tij.chapter14
 * describe: 14章测试1
 * creat_user: haoxiaol
 * creat_date: 2018/8/15
 * creat_time: 14:10
 **/
public class ToyTest {

    static void printInfo(Class cc) {
        System.out.println(cc.getName() + "____" + cc.isInterface());
        System.out.println(cc.getSimpleName());
        System.out.println(cc.getCanonicalName());
    }

    public static void main(String[] args) {
        Class c = null;
        try {
            //使用forName是必须使用全名（包含包名--猜测是防止重名情况）
            c = Class.forName("tij.chapter14.FancyToy");
        } catch (ClassNotFoundException e) {
            System.out.println("没有找到这个类FancyToy");
            System.exit(1);
        }
        printInfo(c);

        //获取该类实现的所有接口
        for (Class face : c.getInterfaces()) {
            printInfo(face);
        }

        //获取基类
        Class up = c.getSuperclass();
        Object ob = null;
        try {
            //通过类型--实例化  、//此方法必须在类中有默认构造方法
            ob = up.newInstance();
        } catch (InstantiationException e) {
            System.out.println("不能被实例化");
            System.exit(1);
        } catch (IllegalAccessException e) {
            System.out.println("不能 access");
            System.exit(1);
        }
        printInfo(ob.getClass());

    }


}
