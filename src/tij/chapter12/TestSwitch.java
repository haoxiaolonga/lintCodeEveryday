package tij.chapter12;

public class TestSwitch {

    public static void main(String[] args) {
        int x = 1;
        try {
            //swith在没有break或者异常的情况会依次向后走完（包括default）
            switch (x) {
                case 1:
                System.out.println(1);
//                    throw new NullPointerException();
                case 2:
                System.out.println(2);
//                    throw new MyException();
                case 3:
                System.out.println(3);
//                    throw new Exersice25_A();
                default:
                    System.out.println("默认");
                    return;
            }
        } catch (Exception e) {
            System.out.println(e.getClass());
        }
    }

}
