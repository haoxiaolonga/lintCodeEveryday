package singleton;

import java.sql.SQLOutput;

/**
*@ClassName Singleton1
*@Description  懒汉式单例，不支持多线程
*@Author haoxl
*@Date 2019/7/22 11:10
*/
public class Singleton1 {

    private static Singleton1 singleton1;

    /**
     * 私有构造，不能外部创建对象
     */
    private Singleton1(){

    }

    /**
     * 公共方法获取实例对象
     * @return
     */
    public static Singleton1 getSingleton1Instance(){
        if(singleton1 == null){
            singleton1 = new Singleton1();
        }
        return singleton1;
    }


    public static void main(String[] args) {

        int i = 0;
        while(i < 10){
            i ++;
            new Thread(()->{
                System.out.println(Singleton1.getSingleton1Instance());
            }).start();
        }
    }

}
