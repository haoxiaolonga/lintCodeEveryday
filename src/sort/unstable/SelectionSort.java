package sort.unstable;

import org.junit.Test;

/**
 * class_name: SelectionSort
 * package: sort.unstable
 * describe: 选择排序
 * creat_user: haoxiaol
 * creat_date: 2019/5/6
 * creat_time: 10:16
 **/
public class SelectionSort {

    @Test
    public void test(){
        int[] arr = {1,5,2,98,2,99,3,1};
        selectionSort(arr);
        int count = 0;
        while (count < arr.length){
            System.out.println(arr[count]);
            count++;
        }
    }

    /**
     * 选择排序
     *首先在未排序序列中找到最小（大）元素，存放到排序序列的起始位置，
     * 然后，再从剩余未排序元素中继续寻找最小（大）元素（找到后就交换位置）
     * @param arr
     * @return
     */
    public static int[] selectionSort(int[] arr) {

        if(arr == null || arr.length == 0) {
             return arr;
        }

        int minIndex = 0;
        for(int i = 0; i < arr.length; i++) {
            minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if(arr[j] < arr[minIndex]) {//每次寻找最小索引
                    minIndex = j;
                }
            }
            if(minIndex != i){
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
        }

        return arr;
    }


}
