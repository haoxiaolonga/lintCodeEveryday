package proxy;

public class StaticProxy implements Man {

    public ManImpl target;

    public StaticProxy(ManImpl target){
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
