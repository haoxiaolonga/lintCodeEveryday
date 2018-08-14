package tij.chapter12;

/**
 * class_name: Exersice25_A
 * package: tij.chapter12
 * describe: 多重异常继承测试
 * creat_user: haoxiaol
 * creat_date: 2018/8/14
 * creat_time: 10:39
 **/
public class Exersice25_C extends Exersice25_B {

    void F() throws Exersice25_C {
        throw new Exersice25_C();
    }

    public static void main(String[] args) {
        Exersice25_A tt = new Exersice25_C();
        try {
            tt.F();   //异常捕获--就近原则，找到适配的就自动跳出catch
        } catch (Exersice25_C c) {
            System.out.println("c");

        } catch (Exersice25_B c) {
            System.out.println("B");

        } catch (Exersice25_A c) {
            System.out.println("A");

        } catch (Exception e) {  //此时抛出C的异常，
            System.out.println(e);
        }

    }


}
