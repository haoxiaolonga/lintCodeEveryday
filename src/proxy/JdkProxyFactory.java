package proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
*@ClassName JdkProxyFactory
*@Description  jdk动态代理
*@Author haoxl
*@Date 2019/7/22 9:50
*/
public class JdkProxyFactory implements InvocationHandler {

//    Proxy类
//    作用就是用来动态创建一个代理对象newProxyInstance
    public Object target;


    public Object createProxyInstance(Object target){
        this.target = target;
        return Proxy.newProxyInstance(target.getClass().getClassLoader(),target.getClass().getInterfaces(),this);
    }


    /**
     * 反射使用目标对象method
     * @param proxy
     * @param method
     * @param args
     * @return
     * @throws Throwable
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result = null;
        System.out.println("此处执行代理行为");
        //通过JVM反射调用
        result = method.invoke(this.target,args);
        return result;
    }

    public static void main(String[] args) {

        //创建代理
        JdkProxyFactory jdkProxyFactory = new JdkProxyFactory();

        //目标对象
        ManImpl manImpl = new ManImpl();

        //代理目标对象接口
        Man man = (Man)jdkProxyFactory.createProxyInstance(manImpl);

        //执行接口方法
        man.say();

    }

}
