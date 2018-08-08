package tij.chapterten;

/**
 * class_name: Parcel11
 * package: tij.chapterten
 * describe: 嵌套类
 * creat_user: haoxiaol
 * creat_date: 2018/8/8
 * creat_time: 16:51
 **/
public class Parcel11 {


    private static class One{

        private int i = 11;
        public int getValue(){
            return i;
        }

    }

    protected static class Two{
        public static void f(){

        }
        static int x = 10;
        static class TwoInner {
            public static void f(){

            }
            static  int x = 10;
        }
    }

    public static One getOne(){
        return new One();
    }

    public static Two getTwo(){
        return new Two();
    }

    public static void main(String[] args) {
        One one = getOne();
        Two two = getTwo();
    }

}
