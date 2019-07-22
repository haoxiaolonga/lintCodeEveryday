package singleton;

/**
 * 枚举实现单例
 */
public enum singletonEnum {

    INSTANCE;
    public void whateverMethod(){

    }

    public static void main(String[] args) {

        int i = 0;
        while(i < 10){
            i ++;
            new Thread(()->{
                System.out.println(singletonEnum.INSTANCE);
            }).start();
        }
    }

}
