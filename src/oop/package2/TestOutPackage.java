package oop.package2;

import oop.package1.TestArea;

/**
*@ClassName Test
*@Description  测试包1下的作用域
*@Author haoxl
*@Date 2019/7/22 16:51
*/
public class TestOutPackage{


    public static void main(String[] args) {

        TestArea testArea = new TestArea();

        //只有public属性 可以在外部包访问
        System.out.println(testArea.public_);
    }


}
