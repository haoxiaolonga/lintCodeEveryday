package serializable;

import java.io.*;
import java.util.Optional;

/**
*@ClassName TestSerializable
*@Description  测试序列化
*@Author haoxl
*@Date 2019/7/23 16:34
*/
public class TestSerializable implements Serializable {

    private static final long serialVersionUID = 1L;

    private String name;

    //transient 修饰的属性不能被序列化和反序列化，基础类型为默认值，引用类型为null
    public transient String color;

    public static String a="123";

    private String age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "TestSerializable{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", age='" + age + '\'' +
                ", a='" + a + '\'' +
                '}';
    }

    public static void main(String[] args) {
        //测试序列化
        serialized();

        //静态变量不会被序列化，反序列化时，会通过classloader得到静态变量？
        a="234";
        Optional<TestSerializable> t = Optional.ofNullable(dserialized());
        if(t.isPresent()){
            System.out.println(t.get());
        }
    }

    /**
     * 序列化
     */
    public static void serialized(){

        TestSerializable t = new TestSerializable();
        t.setAge("20");
        t.setName("张三");
        t.color="red";
        ObjectOutputStream oos = null;
        try {
            oos = new ObjectOutputStream(new FileOutputStream(new File("d:/test.txt")));
            oos.writeObject(t);
            System.out.println("对象序列化成功！");
            oos.close();
        } catch (IOException e) {
        } finally {
            try {
                oos.close();
            } catch (IOException e){
            }
        }
    }


    /**
     * 反序列化
     */
    public static TestSerializable dserialized(){
        ObjectInputStream ios = null;
        TestSerializable res = null;
        try {
            ios = new ObjectInputStream(new FileInputStream("d:/test.txt"));
            Object o = ios.readObject();
            if(o instanceof TestSerializable){
                System.out.println("对象反序列化成功！");
                res = (TestSerializable)o;
            }
            ios.close();
        } catch (IOException e) {
        } catch (ClassNotFoundException e) {
        } finally {
            try {
                ios.close();
            } catch (IOException e){
            }
        }
        return res;
    }

}
