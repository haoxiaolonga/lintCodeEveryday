package test201803.day30;


import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * class_name: Lambda
 * package: test201803.day30
 * describe: 初试lambda特性
 * creat_user: haoxiaol
 * creat_date: 2018/3/30
 * creat_time: 15:03
 **/
public class Lambda {
    /**
     * method_name: testOne
     * param: []
     * param: void
     * describe: 1
     * creat_user: haoxiaol
     * creat_date: 2018/4/2
     * creat_time: 14:20
     **/
    @Test
    public void testOne() {

//         new Thread( () ->System.out.println(" 这是一个测试") ).start();
        //或者写为
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("ceshi");
            }
        }).start();
    }

    @Test
    public void testTwo() {
        int a = 0 ; int b = 1;
        new Thread( () -> System.out.println(a)).start();
    }

    @Test
    public void testThree(){
        System.out.println(123123);
    }
    @Test
    public void testList() {
        List<String> list = Arrays.asList("One","Two","Three","Four");
        /*for (String a : list) {
            System.out.println(a);
        }*/
        //或者用lambda
        list.forEach((temp) -> System.out.println(temp));

    }
    @Test
    public void testPredicate(){
        List<String> langs = Arrays.asList("java","scala","net","phthon");
        System.out.println("以J开始的：");
        filter(langs,(str) -> str.toString().startsWith("j"));

        System.out.println("以n结尾的：");
        filter(langs,(str) -> str.toString().endsWith("n"));

        System.out.println("输出所有：");
        filter(langs,(str) -> true);

        System.out.println("字符串长度大于4的：");
        filter(langs,(str) -> str.toString().length() > 4);


    }
    /**
     * method_name: filter
     * param: [list, condition]
     * param: void
     * describe: 用lambda和predicate做过滤器
     * creat_user: haoxiaol
     * creat_date: 2018/4/3
     * creat_time: 9:38
     **/
    public void filter(List<String> list, Predicate condition) {
        /* 获取stream通过过滤条件 参数传入 condition 再遍历   */
        list.stream().filter((name) -> (condition.test(name))).forEach((name) -> {
            System.out.println(name + " ");
        });
    }
    /**
     * method_name: testMorePredicate
     * param: []
     * param: void
     * describe: 测试多条件过滤
     * creat_user: haoxiaol
     * creat_date: 2018/4/3
     * creat_time: 10:02
     **/
    @Test
    public void testMorePredicate() {
        List<String> langs = Arrays.asList("java","scala","net","phthon");
        Predicate<String> conditionOne = (str) -> str.contains("a");
        Predicate<String> conditionTwo = (str) -> str.length() == 4;
        /*filter();*/
    }


}
