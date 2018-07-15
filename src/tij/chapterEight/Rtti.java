package tij.chapterEight;

/**
 * class_name: Rtti
 * package: tij.chapterEight
 * describe: test cast class
 * creat_user: haoxiaol
 * creat_date: 2018/7/15
 * creat_time: 下午11:29
 **/
public class Rtti {
    public static void main(String[] args) {
        Useful[] x = {
                new Useful() ,
                new MoreUseful()
        };
        x[0].f();
        x[1].f();
//        x[1].u(); // 找不到，因为父类没有改方法
        ((MoreUseful)x[1]).u();
//        ((MoreUseful)x[0]).u(); // 强转错误，向下转型，必须确保是导出类的实现
    }

}
