package tij.chapter12;

/**
 * class_name: Exersice25_A
 * package: tij.chapter12
 * describe: 多重异常继承测试
 * creat_user: haoxiaol
 * creat_date: 2018/8/14
 * creat_time: 10:39
 **/
public class Exersice25_B extends Exersice25_A{

    void F() throws Exersice25_B {
        throw new Exersice25_B();
    }

}
