package sort.unstable;

import org.junit.Test;

/**
 * class_name: ShellSort
 * package: sort.unstable
 * describe: 希尔排序
 * creat_user: haoxiaol
 * creat_date: 2019/5/6
 * creat_time: 10:52
 **/
public class ShellSort {

    @Test
    public void test(){
        int[] arr = {1,5,2,98,2,99,3,1};
        shellSort(arr);
        int count = 0;
        while (count < arr.length){
            System.out.println(arr[count]);
            count++;
        }
    }

    /**
     * 希尔排序
     * 利用shell增量，每次分组，每个组内进行插入排序，当最后增量为1时，即为1组，就是全部数据
     * 组内元素的选取: 相隔grap个之间的元素将分到一组
     * @param arr
     * @return
     */
    public static int[] shellSort(int[] arr) {

        if(arr == null || arr.length == 0) {
            return arr;
        }
        int lenth = arr.length;
        int temp;
        int grap = lenth / 2;
        while(grap > 0) {
            for(int i = grap; i < lenth; i ++) {//排序该增量下的组内元素
                temp = arr[i];
                //前一个组内元素，考虑间隔
                int preIndex = i - grap;
                while(preIndex >= 0 && arr[preIndex] > temp){//插入排序，大的，依次向后面移动
                    arr[preIndex + grap] = arr[preIndex];
                    preIndex -= grap;
                }
                arr[preIndex + grap] = temp;
            }
            //改变增量
            grap /= 2;
        }
        return arr;
    }

}
