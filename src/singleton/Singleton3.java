package singleton;

/**
*@ClassName Singleton2
*@Description  饿汉式
*@Author haoxl
*@Date 2019/7/22 11:10
*/
public class Singleton3 {

    /** 先加载静态变量，静态块，然后属性 然后是构造方法
     *  类加载时就初始化，浪费内存
     */
    private static Singleton3 singleton3 = new Singleton3();

    /**
     * 私有构造，不能外部创建对象
     */
    private Singleton3(){

    }

    /**
     * 基于 classloader 机制避免了多线程的同步问题，不过，instance 在类装载时就实例化
     * 所以没有实现lazy loading
     */
    public static Singleton3 getSingleton1Instance(){
        return singleton3;
    }

    public static void main(String[] args) {

        int i = 0;
        while(i < 10){
            i ++;
            new Thread(()->{
                System.out.println(Singleton3.getSingleton1Instance());
            }).start();
        }
    }

}
