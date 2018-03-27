package test201803.day27;
/**
 * class_name: Name868
 * package: test201803.day27
 * describe: Lintcode 868
 * creat_user: haoxiaol
 * creat_date: 2018/3/27
 * creat_time: 下午10:19
 **/
public class Name868 {

    public static void main (String[] args) {

        int[] nums = new int[] {1,12,-5,-6,50,3};
        int k = 4;

        double res = findMaxAverage(nums, k);
        System.out.println(res);
    }
    /**
     * method_name: findMaxAverage
     * param: [nums, k]
     * describe: 给定长度为k的连续子数组
     * creat_user: haoxiaol
     * creat_date: 2018/3/27
     * creat_time: 下午10:22
     **/
    public static double findMaxAverage(int[] nums, int k) {
        if (nums.length == 0 || k == 0) {
            return 0;
        }
        if (nums.length < k) {
            return 0;
        }
        double initValue = 0.0; //结果
        double tempValue = 0.0;
        /**
         * 便利找出连续最大的和
         */
        for (int i = 0 ; i < nums.length; i ++) {
            if( i < k) {
                initValue += nums[i];
                tempValue = initValue;
                continue;
            }
            tempValue = tempValue - nums[i - k] + nums[i];
            initValue = Math.max(initValue,tempValue);
        }

        return initValue / k;
    }

}
