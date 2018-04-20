package test201804.day20;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * class_name: Name838
 * package: test201804.day20
 * describe: 838  Subarray Sum Equals K
 * creat_user: haoxiaol
 * creat_date: 2018/4/20
 * creat_time: 14:14
 **/
public class Name838 {

    @Test
    public void testSubArray() {
        int[] nums = {1,2,3,4,5};
        int k = 5;
        System.out.println(subarraySumEqualsK(nums, k));
    }

    /**
     * method_name: subarraySumEqualsK
     * param: [nums, k]
     * param: int
     * describe: 连续子数组的和为目标值得个数
     * 思路：刚开始想的暴力解法，计算和 根据差值找K
     *
     * 优化：将值存到hashMap中，直接可以找到sum - k = a,
     *
     * a 为之前某几个 数的和，则 a 到该sum之间的和为K，个数++。
     *
     * creat_user: haoxiaol
     * creat_date: 2018/4/20
     * creat_time: 14:15
     **/
    public int subarraySumEqualsK(int[] nums, int k) {
        // write your code here


		/*
		O(N2)超时
		int length = nums.length;
		int count = 0;
		int[] addNums = new int[length];
		if (length >=1) {
			addNums[0] = nums[0];
		} else {
			return count;
		}
		//保存连续项的和到新数组
		for ( int i = 1; i < length; i ++) {
			addNums[i] = addNums[i - 1] + nums[i];
		}
	    // 循环找出本身为K或者差值为K的结果
		for (int i = 0; i < length; i ++) {
			if (addNums[i] == k){ //该和已经为K
				count ++;
			}
			for (int j = 0; j < i; j ++) {
				if (addNums[i] - addNums[j] == k) { //依次剔除前一位
					count ++;
				}
			}
		}
		return count;

		*/
        int sum = 0, result = 0;
        Map<Integer, Integer> sumMap = new HashMap<>();
        sumMap.put(0, 1); //直接相等于K
        for (int num : nums) {
            sum += num;

            if (sumMap.containsKey(sum - k)) {//前面有值等于该值，则这中间数的和为K
                result += sumMap.get(sum - k);
            }

            if (sumMap.containsKey(sum)) { //记录连续子数组的和
                sumMap.put(sum, sumMap.get(sum) + 1);
            } else {
                sumMap.put(sum, 1);
            }

        }
        return result;
    }
}
