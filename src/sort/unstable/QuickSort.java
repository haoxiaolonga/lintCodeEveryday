package sort.unstable;

import org.junit.Test;

/**
 * class_name: QuickSort
 * package: sort.unstable
 * describe: 快速排序
 * creat_user: haoxiaol
 * creat_date: 2019/5/6
 * creat_time: 13:50
 **/
public class QuickSort {


    @Test
    public void test(){
        int[] arr = {6,1,2,7,9,3,4,5,10,8};
        quickSort(arr, 0, arr.length - 1);
        int count = 0;
        while (count < arr.length){
            System.out.println(arr[count]);
            count++;
        }
    }


    /**
     * 快速排序
     * 使用分治法来把一个串（list）分为两个子串（sub-lists）
     * 所有元素比基准值小的摆放在基准前面，所有元素比基准值大的摆在基准的后面
     * 递归地（recursive）把小于基准值元素的子数列和大于基准值元素的子数列排序
     * @param arr
     * @return
     */
    public static int[] quickSort(int[] arr, int start, int end) {
        if(arr.length < 1 || start < 0 || end >= arr.length || start > end) {
            return null;
        }

        int smallIndex = partition(arr, start, end);
        if(smallIndex > start){ //小于基准的子数列排序
            quickSort(arr,start,smallIndex - 1);
        }
        if(smallIndex < end){//大于基准的子数列排序
            quickSort(arr, smallIndex + 1, end);
        }
        return arr;
    }

    /**
     * 部分排序,找中间数
     * @param arr
     * 将大的数放到后面去，小的数放到前面去，中间位置为smallIndex最后为基准，
     * 基准这里是以最后arr[end]为基准的看的
     * @param start
     * @param end
     * @return
     */
    public static int partition(int[] arr, int start, int end){

        int smallIndex = start - 1;
        for(int i = start; i <= end; i++){ //该阶段里面遍历,左边开始
            if(arr[i] <= arr[end]) { //以最后的数为基准，存在小于基准，smallIndex + 1，其余的都是大于基准的数
                smallIndex++;
                if(i > smallIndex){ //遇到大的数时，smallIndex没+,依旧指向大于的一个数，然后交换，那么大的在后面，小的就在前
                    swap(arr, i, smallIndex);
                }
            }
        }
        return smallIndex;
    }

    /**
     * 交换值
     * @param arr
     * @param i
     * @param j
     */
    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}
