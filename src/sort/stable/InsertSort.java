package sort.stable;

import org.junit.Test;

/**
 * class_name: InsertSort
 * package: sort.stable
 * describe: 插入排序
 * creat_user: haoxiaol
 * creat_date: 2019/2/1
 * creat_time: 14:12
 **/
public  class InsertSort {


    @Test
    public void test(){
        int[] arr = {1,5,2,98,2,99,3,1};
        insertSort(arr);
        int count = 0;
        while (count < arr.length){
            System.out.println(arr[count]);
            count++;
        }
    }


    /**
     * 插入排序
     * 找到相应位置并插入。插入排序在实现上，通常采用in-place排序（即只需用到O(1)的额外空间的排序），
     * 因而在从后向前扫描过程中，需要反复把已排序元素逐步向后挪位，为最新元素提供插入空间
     * @param arr
     * @return
     */
    public static int[] insertSort(int[] arr) {

        if(arr == null || arr.length == 0) {
            return arr;
        }

        for(int i = 0; i < arr.length; i++) {
            int temp = arr[i];
            //获取当前位置的值
            for(int j = i - 1; j >= 0; j--) {//依次比较前面已排好序的数
                if(temp > arr[j]) {
                    //这个位置就是插入位置
                    arr[j + 1] = temp;
                    //找到位置就退出
                    break;
                } else {//向后移动
                    arr[j + 1] = arr[j];
                }
            }

        }
        return arr;

    }



}
