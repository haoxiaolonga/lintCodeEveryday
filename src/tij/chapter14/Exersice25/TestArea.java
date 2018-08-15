package tij.chapter14.Exersice25;

/**
 * class_name: TestArea
 * package: tij.chapter14.Exersice25
 * describe: 测试跨包权限
 * creat_user: haoxiaol
 * creat_date: 2018/8/15
 * creat_time: 17:46
 **/
public class TestArea {
    public void f() {
        System.out.println("public");
    }

    void g() {
        System.out.println("friend");
    }

    private void h() {
        System.out.println("private");
    }
}
