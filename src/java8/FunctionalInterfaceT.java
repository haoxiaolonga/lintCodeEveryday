package java8;

/**
*@ClassName FunctionalInterface
*@Description  函数式接口
 *
 *  就是一个有且仅有一个抽象方法，但是可以有多个非抽象方法的接口。
 *
*@Author haoxl
*@Date 2019/7/24 14:00
*/
@FunctionalInterface
interface FunctionalInterfaceT {

    void test(String a);


    //声明默认方法
    default void test2(String b){

    }

    //接口可以声明（并且可以提供实现）静态方法，只能在实现类使用
    static void test3(String c){
        System.out.println(c);
    }

    public static void main(String[] args) {

        FunctionalInterfaceT t = a -> System.out.println(a);
        t.test("你好");
        t.test2("默认");
    }

}
