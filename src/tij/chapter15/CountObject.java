package tij.chapter15;

import java.util.ArrayList;
import java.util.List;

/**
 * class_name: CountObject
 * package: tij.chapter15
 * describe: 可计数的对象
 * creat_user: haoxiaol
 * creat_date: 2018/8/17
 * creat_time: 14:13
 **/
public class CountObject {

    private static long count = 0;
    private final long id = count++;

    public long getId() {
        return id;
    }

    @Override
    public String toString() {
        return "第" + getId();
    }

    public static void main(String[] args) {

        //利用生成器生成类型生成器
        Generator<CountObject> ge = BasicGenerator.create(CountObject.class);
        for (int i = 0; i < 5; i++) {
//            next方法实例化对象，--》自动调用toString 。toString被重写--》输出id
            System.out.println(ge.next());
        }

        //练习14不是用create，直接调用显示的构造器
        Generator<CountObject> ge2 = new BasicGenerator<>(CountObject.class);
        List<CountObject> tt = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            tt.add(ge2.next());
        }

        tt.forEach((t) -> {
            System.out.println(t);
        });

    }

}
