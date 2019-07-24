package java8;

import sun.applet.Main;

import java.util.Arrays;
import java.util.List;

/**
*@ClassName MethodReference
*@Description  方法引用
 *
 * 通过方法的名字来指向一个方法
 * 使语言的构造更紧凑简洁，减少冗余代码
 * 方法引用使用一对冒号 ::
 *
 *
*@Author haoxl
*@Date 2019/7/24 10:10
*/
public class MethodReference {

    public static void collide(final MethodReference car) {
        System.out.println("Collided " + car.toString());
    }

    public void follow(final MethodReference another) {
        System.out.println("Following the " + another.toString());
    }

    public void repair() {
        System.out.println("Repaired " + this.toString());
    }

    public static void main(String[] args) {

        final List< MethodReference > cars = Arrays.asList( new MethodReference() );

        //静态方法直接引用
        cars.forEach( MethodReference::collide);//car.collide(car);

//        特定类的任意对象的方法引用：它的语法是Class::method实例如下.(没有参数的方法)
        cars.forEach(MethodReference::repair);// car.repair(car);

        MethodReference temp = new MethodReference();
        cars.forEach(temp::follow); //类似于：car.follow(temp);

        cars.forEach(System.out::println);
    }
}
