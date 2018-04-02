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
//        langs.forEach((str) -> str.startsWith("j"));
    }
    public void filter(List<String> list, Predicate condition) {
        list.stream().filter((name) -> (condition.test(name))).forEach((name) -> {
            System.out.println(name + " ");
        });
    }

}
