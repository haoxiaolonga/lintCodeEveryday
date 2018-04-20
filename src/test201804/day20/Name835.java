package test201804.day20;

import org.junit.Test;

/**
 * class_name: Name835
 * package: test201804.day20
 * describe: Hamming Distance  二进制显示时有几位不相同
 * creat_user: haoxiaol
 * creat_date: 2018/4/20
 * creat_time: 15:15
 **/
public class Name835 {
    @Test
    public void testHaming() {
        int a = 1321331;
        int b = 641131;
        System.out.println(hammingDistance(a, b));
    }
    /**
     * method_name: hammingDistance
     * param: [x, y]
     * param: int
     * describe: 计算二进制中有几个不相同的位置
     * creat_user: haoxiaol
     * creat_date: 2018/4/20
     * creat_time: 15:16
     **/
    public int hammingDistance(int x, int y) {

        //异或运算：相同则结果为0，不同则结果为1。
        int val = x ^ y;
        int count = 0;
        //100 减一为001，与运算为0，这样每次排除一个1
        while(val != 0) {
            count ++;
            val  &= (val - 1);
        }

        return count;
    }
}
