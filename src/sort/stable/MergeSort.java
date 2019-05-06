package sort.stable;

import org.junit.Test;

import java.util.Arrays;

/**
 * class_name: MergeSort
 * package: sort.stable
 * describe: 归并排序
 * creat_user: haoxiaol
 * creat_date: 2019/5/6
 * creat_time: 11:25
 **/
public class MergeSort {



    @Test
    public void test(){
        int[] arr = {1,5,2,98,2,99,3,1};
        arr = mergeSort(arr);
        int count = 0;
        while (count < arr.length){
            System.out.println(arr[count]);
            count++;
        }
    }

    /**
     * 归并排序O(n log n）,额外空间
     * 选择排序的优化，分治法
     * 即先使每个子序列有序，再使子序列段间有序。若将两个有序表合并成一个有序表，称为2-路归并
     * @param arr
     * @return
     */
    public static int[] mergeSort(int[] arr) {

        if(arr == null || arr.length == 0 || arr.length < 2) {
            return arr;
        }
        //使用递归,每次减半元素，做子序列排序
        int mid = arr.length / 2;
        int[] left = Arrays.copyOfRange(arr,0,mid);
        int[] right = Arrays.copyOfRange(arr,mid,arr.length);

        return merge(mergeSort(left),mergeSort(right));
    }

    /**
     * 合并子序列
     * @param left
     * @param right
     * @return
     */
    public static int[] merge(int[] left, int[] right) {

        int[] res = new int[left.length + right.length];
        for(int index = 0, i = 0, j = 0; index < res.length; index++) {
            if(i >= left.length){//超出左边长度
                res[index] = right[j++];
            } else if(j >= right.length) {//超出右边长度了
                res[index] = left[i++];
            } else if(left[i] > right[j]){//左边大
                res[index] = right[j++];
            } else {
                res[index] = left[i++];
            }
        }
        return res;
    }


}
