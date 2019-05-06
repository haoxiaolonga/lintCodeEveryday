package sort.unstable;

import org.junit.Test;

public class QuickSortTest {

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
     * 快排
     * @param arr
     * @param start
     * @param end
     * @return
     */
    public static int[] quickSort(int[] arr, int start, int end){

        //判断边界
        if(arr == null || arr.length < 1 || start < 0 || end >= arr.length || start > end) {
            return null;
        }

        //子方法，寻找基准
        int datumIndex = partition(arr, start, end);
        if(datumIndex > start){//基准大于开始位置，则有小于的部分，需要子排序
            quickSort(arr,start,datumIndex - 1);
        }
        if(datumIndex < end) { //同理，大于部分也进行子排序
            quickSort(arr,datumIndex + 1,end);
        }
        return arr;
    }

    public static int partition(int[] arr, int start, int end){

        //基准从前一个开始
        int datumIndex = start - 1;
        for(int i = start; i <= end; i++){//遍历此范围内的数据,
            //默认以最后一个数为基准，比较
            if(arr[i] <= arr[end]){ //存在比基准小的数，那么基准位置移动一位
                datumIndex++;
                if(i > datumIndex){//如果遍历的序列跑到前，那么肯定存在有大于基准的数，则交换
                    //datumIndex为大的数
                    //走到最后时，将基准放在大小值的分隔位置
                    int temp = arr[i];
                    arr[i] = arr[datumIndex];
                    arr[datumIndex] = temp;
                }
            }
        }
        return datumIndex;
    }

}
