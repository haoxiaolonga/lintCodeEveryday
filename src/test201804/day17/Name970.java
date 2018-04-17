package test201804.day17;

import org.junit.Test;

/**
 * class_name: Name970
 * package: test201804.day17
 * describe: 大生意：计算怎样才可以赚的最多
 * creat_user: haoxiaol
 * creat_date: 2018/4/17
 * creat_time: 16:37
 **/

public class Name970 {
    @Test
    public void testBig() {
        int[] a = {3,1,5};
        int[] b = {4,3,100};
        int k = 10;
        k = bigBusiness(a, b, k);
        System.out.println("可以赚："+ k);
    }

    public int bigBusiness(int[] a, int[] b, int k) {
        /**
         * method_name: bigBusiness
         * param: [a, b, k]
         * param: int
         * describe: 思路：每次买利润最大的电影，依次循环
         * creat_user: haoxiaol
         * creat_date: 2018/4/17
         * creat_time: 16:38
         **/
        if (a.length == 0){
            return k;
        }
        boolean isEnd = true;
        while (isEnd){
            int temp = 0; //记录利润
            int j = -1; // 记录位置
            for (int i = 0; i < a.length; i ++) {
                if (a[i] == 0 || a[i] > k || a[i] >= b[i]) { //买不起或者亏本或者已买过不考虑

                } else {
                    if (temp < b[i] - a[i]) { //利润小于该组利润
                        temp =  b[i] - a[i];
                        j = i;
                        isEnd = false;
                    }
                }
            }
            if ( j >= 0) {
                k += temp;
                a[j] = 0;
            }
            isEnd = !isEnd;
        }

        return k;

        //不选局部最优 ：有缺陷
		/*if (a.length == 0){
			return k;
		}
		boolean isEnd = true;
		while (isEnd){
			for (int i = 0; i < a.length; i ++) {
				if (a[i] == 0 || a[i] > k|| a[i] >= b[i]) { //买不起或者已买过或者亏本
					continue;
				} else {
					k = k - a[i] + b[i];
					a[i] = 0;
					isEnd = false;
					break;
				}
				
			}
			isEnd = !isEnd;
		}
		
		return k;*/
    }
}
