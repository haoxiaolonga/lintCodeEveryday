package tij.chapter14.Exersice25T;

import tij.chapter14.Exersice25.TestArea;

import java.lang.reflect.Method;

/**
 * class_name: testDemo
 * package: tij.chapter14.Exersice25T
 * describe: 测试练习25
 * creat_user: haoxiaol
 * creat_date: 2018/8/15
 * creat_time: 17:48
 **/
public class testDemo {

    public static void main(String[] args){
        TestArea t = new TestArea();
        t.f();
        Method[] m = t.getClass().getDeclaredMethods();
        for(Method tt : m) {
            tt.setAccessible(true);//通过反射原理--调用非public跨包方法（属性类似）
            try {
                tt.invoke(t);
            } catch (Exception e) {

            }

        }
    }

}
