package tij.chapter14;

/**
 * class_name: Exercise8
 * package: tij.chapter14
 * describe: 练习8
 * creat_user: haoxiaol
 * creat_date: 2018/8/15
 * creat_time: 15:29
 **/
public class Exercise8 {

    /**
     * method_name: allClass
     * param: [o]
     * param: void
     * describe: 打印该对象的继承体系
     * creat_user: haoxiaol
     * creat_date: 2018/8/15
     * creat_time: 15:30
     **/
    public void allClass(Object o) {

        Class c = o.getClass();
        while(null != c) {
            //练习9  --输出。类的域
            System.out.println(c.getDeclaredFields());
            System.out.println(c.getSimpleName());
            c = c.getSuperclass();
        }

    }

    public static void main(String[] args){
        Exercise8 t = new Exercise8();
        t.allClass(t);
    }
}
