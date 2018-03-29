package test201803.day29;

import java.util.ArrayList;
import java.util.List;

/**
 * class_name: Name30
 * package: test201803.day29
 * describe: lintcode 30
 * creat_user: haoxiaol
 * creat_date: 2018/3/29
 * creat_time: 15:17
 **/
public class Name30 {


    class Interval {
        int start, end;

        Interval(int start, int end) {
            this.start = start;
            this.end = end;
        }
    }

    /**
     * method_name: insert
     * param: [intervals, newInterval]
     * param: java.util.List<test201803.day29.Name30.Interval>
     * describe: 插入区间
     * creat_user: haoxiaol
     * creat_date: 2018/3/29
     * creat_time: 15:23
     **/
    public List<Interval> insert(List<Interval> intervals, Interval newInterval) {
        // write your code here
        //思路：找到相交就融合，否则插入，融合的再和后面比较

        if (newInterval == null) {
            return intervals;
        }
        if (intervals == null) {
            intervals = new ArrayList<Interval>();
        }
        int index = -1;
        boolean isAdd = true;
        for (int i = 0; i < intervals.size(); i ++) {
            Interval temp = intervals.get(i);
            if (compareBetween(temp,newInterval)) { //相交
                temp.start = Math.min(temp.start, newInterval.start);
                temp.end = Math.max(temp.end, newInterval.end);
                index = i;
                break;
            }
            if (newInterval.end < temp.start) { //插入到这个位置
                index = i;
                isAdd = false;
                break;
            }
        }
        if (index == -1) { //最后一个
            intervals.add(newInterval);
            return intervals;
        }  else {
            if (isAdd) { //融合进去的
                /* 如果是最后一个  */
                boolean isOver = index == intervals.size() - 1;
                if (isOver) {
                    return intervals;
                }
                List<Interval> res =new ArrayList<Interval>();
                Interval temp = intervals.get(index);
                for (int i = 0; i < intervals.size(); i ++) {
                    if (i < index || isOver) {
                        res.add(intervals.get(i));
                        continue;
                    }
                    if ( i == index) {
                        continue;
                    }
                    Interval tNext =  intervals.get(i);
                    if (compareBetween(temp,tNext)) { //相交
                        temp.start = Math.min(temp.start, tNext.start);
                        temp.end = Math.max(temp.end, tNext.end);
                        if (i == intervals.size() -1) {//防止一直结合到最后一个
                            res.add(temp);
                            isOver = true;
                        }
                    } else { //加入两个，终止比较
                        res.add(temp);
                        res.add(tNext);
                        isOver = true;
                    }
                }
                return res;
            }  else { //插入list
                intervals.add(index,newInterval);
                return intervals;
            }
        }

    }

    /**
     * method_name: compareBetween
     * param: [a, b]
     * param: boolean
     * describe: 判读是否相交
     * creat_user: haoxiaol
     * creat_date: 2018/3/29
     * creat_time: 15:23
     **/
    public boolean compareBetween(Interval a, Interval b) {

        return (a.start >= b.start && a.start <= b.end)
                || b.start >= a.start && b.start <= a.end;

    }
}
