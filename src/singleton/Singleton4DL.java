package singleton;

/**
*@ClassName Singleton4
*@Description  双检锁/双重校验锁
*@Author haoxl
*@Date 2019/7/22 11:10
*/
public class Singleton4DL {

    /** 先加载静态变量，静态块，然后属性 然后是构造方法
     *  类加载时就初始化，浪费内存
     */
    private static volatile Singleton4DL singleton;

    /**
     * 私有构造，不能外部创建对象
     */
    private Singleton4DL(){

    }

    /**
     *  基于原子性操作，volatile让对象在线程间可见，再利用syn保证加锁
     * 所以没有实现lazy loading
     */
    public static Singleton4DL getSingleton1Instance(){

        if(singleton == null){
            synchronized(Singleton4DL.class){
                if(singleton == null){
                    singleton = new Singleton4DL();
                }
            }
        }
        return singleton;
    }

    public static void main(String[] args) {

        int i = 0;
        while(i < 10){
            i ++;
            new Thread(()->{
                System.out.println(Singleton4DL.getSingleton1Instance());
            }).start();
        }
    }

}
