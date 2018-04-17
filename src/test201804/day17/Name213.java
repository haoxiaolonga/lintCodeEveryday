package test201804.day17;

import org.junit.Test;

/**
 * class_name: Name213
 * package: test201804.day17
 * describe: 压缩字符串
 * creat_user: haoxiaol
 * creat_date: 2018/4/17
 * creat_time: 16:34
 **/
public class Name213 {

    @Test
    public void testCom() {
        System.out.println(compress("aabcccccaaa"));
    }

    /**
     * method_name: compress
     * param: [str]
     * param: java.lang.String
     * describe: 压缩字符串，长度若不小于原样，即返回原字符串
     * creat_user: haoxiaol
     * creat_date: 2018/4/17
     * creat_time: 16:35
     **/
    public String compress(String str) {
        // write your code here
        if (str == null || str.length() <= 2) { //只有 a-z
            return str;
        }
        char[] arr = str.toCharArray();
        char now = arr[0];
        int count = 0; //第一次必定相同
        StringBuffer sb = new StringBuffer();
        for (char temp : arr) {
            if(now == temp) {
                count ++;
            } else {
                sb.append(now).append(count);
                now = temp;
                count = 1;
            }
        }
        sb.append(now).append(count); //最后一组还没有加入
        if (sb.toString().length() < str.length()) {
            return sb.toString();
        }
        return str;
    }
}
