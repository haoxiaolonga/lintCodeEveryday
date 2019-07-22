package singleton;

/**
*@ClassName Singleton2
*@Description  懒汉式单例，支持多线程,使用关键字synchronized
*@Author haoxl
*@Date 2019/7/22 11:10
*/
public class Singleton2 {

    private static Singleton2 singleton2;

    /**
     * 私有构造，不能外部创建对象
     */
    private Singleton2(){

    }

    /**
     * 公共方法获取实例对象,加锁，保证线程安全，但是降低效率
     * @return
     */
    public static synchronized Singleton2 getSingleton1Instance(){
        if(singleton2 == null){
            singleton2 = new Singleton2();
        }
        return singleton2;
    }

    public static void main(String[] args) {

        int i = 0;
        while(i < 10){
            i ++;
            new Thread(()->{
                System.out.println(Singleton2.getSingleton1Instance());
            }).start();
        }
    }

}
