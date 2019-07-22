package proxy;

/**
*@ClassName StaticProxy
*@Description  静态代理，只能一对一服务
*@Author haoxl
*@Date 2019/7/22 10:16
*/
public class StaticProxy implements Man {

    public Man target;

    public StaticProxy(Man target){
        this.target = target;
    }

    @Override
    public void say() {

        System.out.println("代理行为：");
        target.say();

    }

    public static void main(String[] args) {

        StaticProxy proxy = new StaticProxy(new ManImpl());
        proxy.say();

    }


}
