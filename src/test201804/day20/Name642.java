package test201804.day20;

import org.junit.Test;

import java.util.LinkedList;
import java.util.Queue;

/**
 * class_name: Name642
 * package: test201804.day20
 * describe: 给出一串整数流和窗口大小，计算滑动窗口中所有整数的平均值。
 * creat_user: haoxiaol
 * creat_date: 2018/4/20
 * creat_time: 16:54
 **/
public class Name642 {

     class MovingAverage {
        int size ;
        Queue<Integer> que ;
        double sum;

        /*
         * @param size: An integer
         */
        public MovingAverage(int size) {

            this.size = size > 0 ? size : 0;
            this.que = new LinkedList<Integer>();
            this.sum = 0.0;
        }

         /**
          * method_name: next
          * param: [val]
          * param: double
          * describe: 計算平均值
          * creat_user: haoxiaol
          * creat_date: 2018/4/20
          * creat_time: 16:58
          **/
        public double next(int val) {
            // write your code here

            if (que.size() == size) {
                int temp = que.poll();
                sum -= temp;
            }
            que.offer(val);
            sum += val;
            int nowSize = que.size();
            return sum / nowSize;
        }
    }

    @Test
    public void testMove() {
        MovingAverage m = new MovingAverage(3);
        System.out.println(m.next(1)); // 返回 1.00000
        System.out.println(m.next(10)); // 返回 5.50000
        System.out.println(m.next(3)) ; // 返回 4.66667
        System.out.println(m.next(5)) ;// 返回 6.00000
    }

}
