package test201804.day13;

import org.junit.Test;

import java.util.Arrays;

/**
 * class_name: Name951
 * package: test201804.day13
 * describe: 重排，规律为必须所有偶数位上的数都小于所有奇数位上的数。同时，偶数位上的数也按照升序排序，奇数位上的也按照升序排序。
 * creat_user: haoxiaol
 * creat_date: 2018/4/13
 * creat_time: 12:52
 **/
public class Name951 {
    @Test
    public void testArrays() {
        int[] nums ={2,0,1,-1,5,10};
        int[] res = rearrange(nums);
        for (int re : res) System.out.println(re);
    }
    /**
     * method_name: rearrange
     * param: [nums]
     * param: int[]
     * describe: 思路：先排序数组，先排偶数的，奇数的为目标数组后半截
     * 注意：数组总数为奇数时要注意越界问题，要不就会少加元素
     * creat_user: haoxiaol
     * creat_date: 2018/4/13
     * creat_time: 12:53
     **/
    private int[] rearrange(int[] nums) {

        if (nums.length == 0 || nums.length == 1 ){
            return nums;
        }
        int[] resArr = new int[nums.length];
        Arrays.sort(nums);
        //总数为奇数是+1，
        int size = nums.length % 2 == 1 ? nums.length / 2 + 1 : nums.length / 2;
        for (int i = 0; i < size; i ++) {
            resArr[2 * i] = nums[i];
            if (i != size -1 || nums.length % 2 == 0 ) { //为奇数的最后一次防止越界
                resArr[2 * i + 1] = nums[i + size];
            }
        }
        return resArr;
    }
}
