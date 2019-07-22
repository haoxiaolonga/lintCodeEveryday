package singleton;

/**
*@ClassName SingletonInner
*@Description  静态内部类实现单例
*@Author haoxl
*@Date 2019/7/22 13:55
*/
public class SingletonInner {

    /**
     * 静态内部类
     */
    private static class SingletonInnerHolder{
        private static final SingletonInner singeton = new SingletonInner();
    }

    /**
     * 私有构造
     */
    private SingletonInner(){
    }

    /**
     * 对静态域使用延迟初始化，应使用这种方式而不是双检锁方式。这种方式只适用于静态域的情况，双检锁方式可在实例域需要延迟初始化时使用
     * @return
     */
    public static final SingletonInner getSingleton1Instance(){
        return SingletonInnerHolder.singeton;

    }

    public static void main(String[] args) {

        int i = 0;
        while(i < 10){
            i ++;
            new Thread(()->{
                System.out.println(SingletonInner.getSingleton1Instance());
            }).start();
        }
    }


}
