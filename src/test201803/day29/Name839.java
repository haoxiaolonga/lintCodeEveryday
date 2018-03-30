package test201803.day29;

import java.util.ArrayList;
import java.util.List;

/**
 * class_name: Name839
 * package: test201803.day29
 * describe: lintcode 839
 * creat_user: haoxiaol
 * creat_date: 2018/3/29
 * creat_time: 17:52
 **/
public class Name839{


    class Interval {
        int start, end;

        Interval(int start, int end) {
            this.start = start;
            this.end = end;
        }
    }

    /**
     * method_name: mergeTwoInterval
     * param: [list1, list2]
     * param: java.util.List<test201803.day29.Name839.Interval>
     * describe: 混合两个范围list
     * creat_user: haoxiaol
     * creat_date: 2018/3/29
     * creat_time: 17:51
     **/
    public List<Interval> mergeTwoInterval(List<Interval> list1, List<Interval> list2) {

        // write your code here
        if (list1 == null || list1.size() == 0) {
            return list2;
        }
        if (list2 == null || list2.size() == 0) {
            return list1;
        }
        int oneIndex = 0; //1数组的下标
        int twoIndex = 0; //2数组的 下标
        int oneSize =  list1.size();
        int twoSize = list2.size();
        boolean reqOneList = false; //是否继续比较1
        boolean reqTwoList = false; //是否继续比较2
        List<Interval> res = new ArrayList<Interval>();
        Interval temp = null;
        while (oneIndex <= oneSize || twoIndex <= twoSize) { //直到两个遍历完全

            updateTempValue(reqOneList,reqTwoList,oneIndex,twoIndex,oneSize,twoSize,list1,list2,temp);
            updateTempValue(reqTwoList,reqOneList,twoIndex,oneIndex,twoSize,oneSize,list2,list1,temp);
           /* if (reqOneList && oneIndex < oneSize ) { //请求第一个
                Interval tempFirst = list1.get(oneIndex);
                if (compareBetween(temp, tempFirst)) { //与1数组相交
                    temp.start = Math.min(temp.start, tempFirst.start);
                    temp.end = Math.max(temp.end, tempFirst.end);
                    oneIndex ++;//向后移动
                    reqTwoList = twoIndex < twoSize; //可能又与2相交，但是不可越界
                    if (oneIndex == oneSize) {
                        reqOneList = false;
                    }
                } else { //不相交了，则index不变
                    reqOneList = false;
                }
            }*/
            /*if (reqTwoList && twoIndex < twoSize) {
                Interval tempTwo = list2.get(twoIndex);
                //不相交了，则index不变
                if (compareBetween(temp, tempTwo)) { //与1数组相交
                    temp.start = Math.min(temp.start, tempTwo.start);
                    temp.end = Math.max(temp.end, tempTwo.end);
                    twoIndex ++;//向后移动
                    reqOneList = oneIndex < oneSize;//可能又与1相交了，但是不可越界
                    if (twoIndex == twoSize) {
                        reqTwoList = false;
                    }
                } else {
                    reqTwoList = false;
                }
            }*/
            if ( (!reqOneList && !reqTwoList) || temp == null ) { //不相交的
                if (temp != null) {
                    res.add(new Interval(temp.start, temp.end));
                }
                Interval tempOne = null;
                Interval tempTwo = null;
                if (oneIndex < oneSize) {
                    tempOne = list1.get(oneIndex);
                }
                if (twoIndex < twoSize) {
                    tempTwo = list2.get(twoIndex);
                }
                if (tempOne == null && tempTwo ==null) {
                    break;
                }
                if (tempOne == null) {
                    temp = new Interval(tempTwo.start, tempTwo.end);
                    twoIndex ++;//向后移动
                    reqOneList = oneIndex < oneSize;
                    continue;
                }
                if (tempTwo == null) {
                    temp = new Interval(tempOne.start, tempOne.end);
                    oneIndex ++;//向后移动
                    reqTwoList = twoIndex < twoSize;
                    continue;
                }
                if (tempOne.start < tempTwo.start) {
                    temp = new Interval(tempOne.start, tempOne.end);
                    oneIndex ++;//向后移动
                    reqTwoList = twoIndex < twoSize;
                } else {
                    temp = new Interval(tempTwo.start, tempTwo.end);
                    twoIndex ++;//向后移动
                    reqOneList = oneIndex < oneSize;
                }
            }

        }

        return res;
    }

    /**
     * method_name: compareBetween
     * param: [a, b]
     * param: boolean
     * describe: 比较是否相交
     * creat_user: haoxiaol
     * creat_date: 2018/3/29
     * creat_time: 17:52
     **/
    public boolean compareBetween(Interval a, Interval b) {

        return (a.start >= b.start && a.start <= b.end)
                || b.start >= a.start && b.start <= a.end;

    }
    /**
     * method_name: updateTempValue
     * param: [req, index, size, temp]
     * param: void
     * describe: 更新temp的属性
     * creat_user: haoxiaol
     * creat_date: 2018/3/30
     * creat_time: 14:47
     **/
    public void updateTempValue(boolean req1, boolean req2,
                                int index1, int index2,
                                int size1, int size2,
                                List<Interval> list1, List<Interval> list2,
                                Interval temp) {
        if (req1 && index1 < size1 ) { //请求第一个
            Interval tempFirst = list1.get(index1);
            if (compareBetween(temp, tempFirst)) { //与1数组相交
                temp.start = Math.min(temp.start, tempFirst.start);
                temp.end = Math.max(temp.end, tempFirst.end);
                index1 ++;//向后移动
                req2 = index2 < size2; //可能又与2相交，但是不可越界
                if (index1 == size1) {
                    req1 = false;
                }
            } else { //不相交了，则index不变
                req1 = false;
            }
        }

    }





}
