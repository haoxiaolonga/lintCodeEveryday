package sort.stable;

import org.junit.Test;

/**
 * class_name: BubbleSort
 * package: sort.stable
 * describe: 冒泡排序
 * creat_user: haoxiaol
 * creat_date: 2019/5/6
 * creat_time: 9:46
 **/
public class BubbleSort {

    @Test
    public void test(){

        int[] arr = {1,5,2,98,2,99,3,1};
        bubbleSort(arr);
        int count = 0;
        while (count < arr.length){
            System.out.println(arr[count]);
            count++;
        }

    }


    /**
     * 冒泡排序
     * 从开始第一对到结尾的最后一对，这样在最后的元素应该会是最大的数
     * 如果某次遍历没有交换，则证明已排好序，可提前终止
     * @param arr
     * @return
     */
    public static int[] bubbleSort(int[] arr) {

        if(arr == null || arr.length == 0) {
            return arr;
        }
        boolean breakFlag;
        for(int i = 0; i < arr.length; i++) { //遍历数组
            breakFlag = true;
            for(int j = 0; j < arr.length - 1 - i; j++) { //两两比较,最大的最后面去了
                if(arr[j + 1] < arr[j]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    breakFlag = false;
                }
            }
            if(breakFlag) {//提前退出循环
                break;
            }
        }
        return arr;
    }

}
