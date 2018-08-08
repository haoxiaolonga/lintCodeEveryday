package tij.chapterten;


/**
 * class_name: Parcel10
 * package: tij.chapterten
 * describe: 匿名内部类使用的参数，必须为final修饰
 * creat_user: haoxiaol
 * creat_date: 2018/8/8
 * creat_time: 16:22
 **/
public class Parcel10 {

    public BaseT getbase(int x, int y) {
        return new BaseT() {
            private int cost;

            {
                cost = x;
                System.out.println("实例化使用参数");
            }

            private int price = y;

            private int getPrice() {

                return price;
            }

        };
    }

    public static void main(String[] args) {
        Parcel10 ten = new Parcel10();
        BaseT t = ten.getbase(10,50);
    }

}
