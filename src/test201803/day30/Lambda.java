package test201803.day30;


import org.junit.Test;

/**
 * class_name: Lambda
 * package: test201803.day30
 * describe: 初试lambda特性
 * creat_user: haoxiaol
 * creat_date: 2018/3/30
 * creat_time: 15:03
 **/
public class Lambda {

    @Test
    public void testOne() {
        new Thread( () ->System.out.println(" 这是一个测试") ).start();
    }
}
