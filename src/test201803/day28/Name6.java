package test201803.day28;

import java.util.Arrays;

/**
 * class_name: Name6
 * package: test201803.day28
 * describe: lintcode 6
 * creat_user: haoxiaol
 * creat_date: 2018/3/28
 * creat_time: 15:25
 **/
public class Name6 {

    public static void main(String[] args) {
        int[] A = {1,3,4,5,6};
        int[] B = {1,2,2,3,4,9};
        int[] res = mergeSortedArray(A, B);
        for (int i : res) {
            System.out.println(i);
        }
    }

    /**
     * method_name: mergeSortedArray
     * param: [A, B]
     * param: int[]
     * describe: 合并排序数组 II
     * creat_user: haoxiaol
     * creat_date: 2018/3/28
     * creat_time: 15:26
     **/
    public static int[] mergeSortedArray(int[] A, int[] B) {
        //思路：将少的的数组合并到多的数组，减少比较的次数
        // write your code here
        if (A.length == 0) return B;
        if (B.length == 0) return A;
        int[] res = new int[A.length + B.length];
        for (int i =0; i < res.length; i ++) {
            if (i < A.length) {
                res[i] = A[i];
            } else {
                res[i] = B[i - A.length];
            }
        }
        Arrays.sort(res);
        return res;
    }
}
