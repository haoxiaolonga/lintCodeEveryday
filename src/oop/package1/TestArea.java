package oop.package1;

/**
*@ClassName TestArea
*@Description  测试作用域
*@Author haoxl
*@Date 2019/7/22 16:49
*/
public class TestArea {

    private int private_;

    int default_;

    protected int protected_;

    public int public_;

    public TestArea() {
    }

    public static void main(String[] args) {

        TestArea testArea = new TestArea();

        //本类下所有属性都可以访问
        System.out.println(testArea.default_);
        System.out.println(testArea.protected_);
        System.out.println(testArea.private_);
        System.out.println(testArea.public_);

    }

}
