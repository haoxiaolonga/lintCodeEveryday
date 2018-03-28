package test201803.day28;
/**
 * class_name: Name407
 * package: test201803.day28
 * describe: lintcode 407
 * creat_user: haoxiaol
 * creat_date: 2018/3/28
 * creat_time: 14:53
 **/
public class Name407 {

    public static void main(String[] args) {
        int[] digits = {9,9,9};
        int[] res = plusOne(digits);
        for (int i : res) {
            System.out.println(i);
        }
    }

    /**
     * method_name: plusOne
     * param: [digits]
     * param: int[]
     * describe: 给定一个非负数，表示一个数字数组，在该数的基础上+1，返回一个新的数组
     * creat_user: haoxiaol
     * creat_date: 2018/3/28
     * creat_time: 14:53
     **/
    public static int[] plusOne(int[] digits) {

        // write your code here
        //思路:遍历逢10加1，
        for (int i = digits.length -1; i >= 0; i --) {
            int temp = digits[i] + 1;
            if (temp != 10) {
                digits[i] = temp;
                break;
            } else {
                digits[i] = 0;
            }
        }
        if (digits[0] == 0) {
            int[] res = new int[digits.length +1];
            res[0] = 1;
            return res;
        } else {
            return digits;
        }
    }
}
