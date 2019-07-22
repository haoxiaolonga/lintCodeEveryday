package oop.package1;

public class TestSonSon extends TestSon {


    public static void main(String[] args) {
        TestSonSon son = new TestSonSon();

        //相同包下的子类的子类除了私有的都可以访问
        System.out.println(son.default_);
        System.out.println(son.protected_);
        System.out.println(son.public_);
    }

}
