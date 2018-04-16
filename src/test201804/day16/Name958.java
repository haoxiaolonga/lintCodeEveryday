package test201804.day16;

import org.junit.Test;

/**
 * class_name: Name958
 * package: test201804.day16
 * describe: 958回文数据流
 * creat_user: haoxiaol
 * creat_date: 2018/4/16
 * creat_time: 15:39
 **/
public class Name958 {

    @Test
    public void testArr() {
        String s = "abba";
        int[] res = getStream(s);
        for (int i : res) {
            System.out.println(i);
        }
    }

    /**
     * method_name: getStream
     * param: [s]
     * param: int[]
     * describe: 一个数据流进来，每次一个字母，当前数据流的排列是否能组成回文串。
     * creat_user: haoxiaol
     * creat_date: 2018/4/16
     * creat_time: 15:40
     **/
    public int[] getStream(String s) {

        // Write your code here
        if(s == null || s.length() == 0) return new int[]{};
        int[] res = new int[s.length()];
        String now = "";
        for (int i = 0; i < s.length(); i ++) {
            String temp = String.valueOf(s.charAt(i));
            if (now.contains(temp)) {
                now = now.replace(temp, "");
            } else {
                now = now.concat(temp);
            }
            if (now.length() <= 1) {
                res[i] = 1;
            }
        }
        return res;

    }
}
