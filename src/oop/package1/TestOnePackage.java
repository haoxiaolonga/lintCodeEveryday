package oop.package1;

public class TestOnePackage {

    public static void main(String[] args) {
        TestArea testArea = new TestArea();

        //相同包下public和protected，default都可以访问
        System.out.println(testArea.public_);
        System.out.println(testArea.protected_);
        System.out.println(testArea.default_);

    }

}
