package designMode.proxymode;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.concurrent.ConcurrentHashMap;

public class CglibProxy{

    public static void main(String[] args) {

        Hashtable x = new Hashtable();
        ConcurrentHashMap b = new ConcurrentHashMap();
        HashMap h = new HashMap();
        h.put(null,null);
        System.out.println("hello");
        try {
            x.put(null,null);
        }catch (Exception e){
            System.out.println("异常1");
        }
        try{
            b.put(null,null);
        }catch (Exception e){
            System.out.println("异常2");
        }

    }

}
