package test201803.day28;

/**
 * class_name: Name14
 * package: test201803.day28
 * describe: lintcode 14
 * creat_user: haoxiaol
 * creat_date: 2018/3/28
 * creat_time: 17:34
 **/
public class Name14 {

    public static void  main(String[] args) {
        int[] nums={1,1,1,1,3,3,3, 3, 4, 5, 10} ;
        int target = 3;//中二分查找3，返回4
        int res = binarySearch(nums, target);
        System.out.println(res);
    }
    /**
     * method_name: binarySearch
     * param: [nums, target]
     * param: int
     * describe: 二分查找第一次出现目标值得位置
     * creat_user: haoxiaol
     * creat_date: 2018/3/28
     * creat_time: 17:37
     **/
    public static int binarySearch(int[] nums, int target) {
        // write your code here

        int min = 0;
        int max = nums.length;
        Integer index = null;
        if(max == 0 || target > nums[max - 1] || target < nums[min]) {
            return -1;
        }
        while (min <= max) {
            int mod = (min + max) / 2;
            if (nums[mod] >  target) {
                max = mod - 1;
                continue;
            }
            if (nums[mod] < target) {
                min = mod +1;
                continue;
            }
            if (nums[mod] == target) {
                if (index == null) index = new Integer(0);
                index = mod;
                max =max - 1;
            }
        }
        return index == null ? -1 : index;
    }
}
