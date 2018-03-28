package test201803.day28;

import java.util.ArrayList;
import java.util.List;

/**
 * class_name: Name50
 * package: test201803.day28
 * describe: lintcode 50
 * creat_user: haoxiaol
 * creat_date: 2018/3/28
 * creat_time: 11:20
 **/
public class Name50 {

    public static void main(String[] args) {
        List<Integer> A = new ArrayList<Integer>();
        A.add(1);A.add(2);A.add(3);
        System.out.println(productExcludeItself(A));
    }

    /**
     * method_name: productExcludeItself
     * param: [nums]
     * param: java.util.List<java.lang.Long>
     * describe: B[i] = i前后数的乘积
     * creat_user: haoxiaol
     * creat_date: 2018/3/28
     * creat_time: 11:22
     **/
    public static List<Long> productExcludeItself(List<Integer> nums) {

        //write your code here
        //思路：先求左边，再遍历求右边
        List<Long> B = new ArrayList<Long>();
        long temp = 1L;
        for (Integer num : nums) { //得到i左边数的乘积
            B.add(temp);
            temp *= num;
        }
        temp = 1;
        for (int i = nums.size() -1; i >= 0; i --) { //最后一个数，除去自己就是只剩左边了
            B.set(i, B.get(i) * temp);
            temp *= nums.get(i);    //依次从后面开始算乘法，
        }
        return B;
    }
}
