package designMode.proxymode;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * class_name: JdkProxyHandler
 * package: designMode.proxymode
 * describe: jdk代理类
 * creat_user: haoxiaol
 * creat_date: 2021/4/16
 * creat_time: 下午3:40
 **/
public class JdkProxyHandler implements InvocationHandler {

    private Object object;

    public JdkProxyHandler(Object object) {
        this.object = object;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        System.out.println("代理前执行逻辑");
        Object result = method.invoke(object,args);
        System.out.println("代理后执行逻辑");

        return result;
    }
}
