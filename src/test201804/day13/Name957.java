package test201804.day13;

import org.junit.Test;

/**
 * class_name: Name957
 * package: test201804.day13
 * describe: 雷达检测
 * 一个2D平面上有一堆雷达（雷达有x, y坐标，
 * 以及能探测到的范围r半径）。
 * 现在有一辆小车要从y = 0和y = 1的区间里面通过并且不能被雷达探测到。
 * 若被检测到，输出YES，否则输出NO。（
 * 可以认为，小车是一条长度为1的线段，沿直线从x = 0 向右前进）
 * creat_user: haoxiaol
 * creat_date: 2018/4/13
 * creat_time: 15:31
 **/
public class Name957 {

    class Point {
        int x;
        int y;
        Point() { x = 0; y = 0; }
        Point(int a, int b) { x = a; y = b; }
    }

    @Test
    public void testR() {
//		coordinates = [[0,2]], radius = [1], 返回 "NO"。
//				coordinates = [[0,2],[1,2]], radius = [1,2], 返回 "YES"
        Point[] coordinates1	={new Point(0,2)};
        int[] radius1 = {1};
        Point[] coordinates2	={new Point(0,2),new Point(1,2)};
        int[] radius2 = {1,2};
        System.out.println(radarDetection(coordinates1, radius1));
        System.out.println(radarDetection(coordinates2, radius2));
    }

    /**
     * method_name: radarDetection
     * param: [coordinates, radius]
     * param: java.lang.String
     * describe: 检测是否在区域范围内
     * creat_user: haoxiaol
     * creat_date: 2018/4/13
     * creat_time: 15:30
     **/
    private String radarDetection(Point[] coordinates, int[] radius) {

        //coordinates 圆心，radius 为半径；
        //只要能覆盖完全 y= 1 到 y =0的区域就肯定被检测
        String res ="NO";
        for (int i = 0; i < coordinates.length; i ++) {
            Point t = coordinates[i];
            int radiu = radius[i];
            if (t.y >=1) { //在y=1上面
                if (t.y - radiu <= 0) {
                    res = "YES";
                    break;
                }
            } else { //在下面，由于是整数
                if (t.y + radiu >= 0) {
                    res = "YES";
                    break;
                }
            }
        }
        return res;
    }
}
