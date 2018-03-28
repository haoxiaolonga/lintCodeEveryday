package test201803.day28;
/**
 * class_name: Name141
 * package: test201803.day28
 * describe: lintcode 141
 * creat_user: haoxiaol
 * creat_date: 2018/3/28
 * creat_time: 13:44
 **/
public class Name141 {


    public static void main(String[] args) {
        int x = 255;
        System.out.println(sqrt(x));
    }

    /**
     * method_name: sqrt
     * param: [x]
     * param: int
     * describe: 求元素的平方根
     * creat_user: haoxiaol
     * creat_date: 2018/3/28
     * creat_time: 13:48
     **/
    public static int sqrt(int x) {

        // write your code here
        /* 解法1*/
        /*String a = String.valueOf(Math.sqrt(x));
		if (a.contains(".")) {
			a = a.substring(0,a.indexOf("."));
		}
		return Integer.valueOf(a);*/
        /*解法2*/
        if (x <= 1) {
            return x;
        }
        int min = 0;
        int max = x;
        int num = 0;
        while (min  <=  max) {
            if (num == (min + max) / 2 ) {
                break;
            }
            num = (min + max) / 2;
            if (Math.pow(num, 2) > x) {
                max = num;
                continue;
            }
            if (Math.pow(num, 2) < x) {
                min = num;
                continue;
            }
            break;
        }
        return num;
    }
}
