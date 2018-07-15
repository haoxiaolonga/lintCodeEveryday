package tij.chapterEight;

import sun.applet.Main;

/**
 * class_name: PrivateOverride
 * package: tij.chapterEight
 * describe: test private extends
 * creat_user: haoxiaol
 * creat_date: 2018/7/15
 * creat_time: 下午10:50
 **/
public class PrivateOverride {

    /**
     * method_name: f
     * param: []
     * describe: 父类的方法
     * creat_user: haoxiaol
     * creat_date: 2018/7/15
     * creat_time: 下午10:52
     **/
    private  void f(){

        System.out.println("父");
    }

    public static void main(String[] args) {
        PrivateOverride test = new Derived();
        // 由于父类方法为private ,多态为实现，导致执行父类方法，而不是动态绑定，调用子类的f方法
        test.f();

    }
}
