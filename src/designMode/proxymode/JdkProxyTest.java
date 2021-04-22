package designMode.proxymode;

import java.lang.reflect.Proxy;

/**
 * class_name: JdkProxyTest
 * package: designMode.proxymode
 * describe: 测试jdk代理
 * creat_user: haoxiaol
 * creat_date: 2021/4/16
 * creat_time: 下午3:45
 **/
public class JdkProxyTest {


    public static void main(String[] args) {

        BuyHouse buyHouse = new BuyHouseImpl();
        BuyHouse buyHouseProxy = (BuyHouse) Proxy.newProxyInstance(BuyHouse.class.getClassLoader(),
                new Class[]{BuyHouse.class},new JdkProxyHandler(buyHouse));
        buyHouseProxy.buyHouse();

    }

}
