package tij.chapter13;

import java.util.ArrayList;
import java.util.List;

/**
 * class_name: InfiniteRecursion
 * package: tij.chapter13
 * describe: toString（）打印地址
 * creat_user: haoxiaol
 * creat_date: 2018/8/14
 * creat_time: 13:48
 **/
public class InfiniteRecursion {

    public String toString() {

        //直接返回this抛出异常(+号重载默认将后面this转换为string错误(递归调用))
//        return "InfiniteRecursion address" + this + "\n";

        return "InfiniteRecursion address" + super.toString() + "\n";
    }


    public static void main(String[] args) {
        List<InfiniteRecursion> list = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            list.add(new InfiniteRecursion());
        }
        System.out.println(list);
    }
}
