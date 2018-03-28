package test201803.day28;
/**
 * class_name: Name373
 * package: test201803.day28
 * describe: lintcode 373
 * creat_user: haoxiaol
 * creat_date: 2018/3/28
 * creat_time: 14:13
 **/
public class Name373 {

    /**
     * method_name: partitionArray
     * param: [nums]
     * param: void
     * describe: 在原数组中完成，不使用额外空间
     * 分割一个整数数组，使得奇数在前偶数在后。
     * creat_user: haoxiaol
     * creat_date: 2018/3/28
     * creat_time: 14:14
     **/
    public void partitionArray(int[] nums) {

        // write your code here
        for (int i =0,j = nums.length -1; i < j; ) {
            if (nums[i] % 2 ==0  && nums[j] % 2 !=0) { //前偶，后奇
                nums[i] = nums[i] ^ nums[j];
                nums[j] = nums[i] ^ nums[j];
                nums[i] = nums[i] ^ nums[j];
                i ++;
                j --;
            } else if (nums[i] % 2 == 0) {
                j --;
            } else {
                i ++;
            }
        }
    }
}
