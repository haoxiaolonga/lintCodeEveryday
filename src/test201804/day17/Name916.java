package test201804.day17;

import org.junit.Test;

/**
 * class_name: Name916
 * package: test201804.day17
 * describe: 判断一个字符串的排列是否为回文
 * creat_user: haoxiaol
 * creat_date: 2018/4/17
 * creat_time: 17:35
 **/
public class Name916 {
    @Test
    public void testPalind() {
        String s = "code";
        System.out.println(canPermutePalindrome(s));
    }

    /**
     * method_name: canPermutePalindrome
     * param: [s]
     * param: boolean
     * describe: 思路：记录出出现奇数次数的字母，判断最后长度即可
     * creat_user: haoxiaol
     * creat_date: 2018/4/17
     * creat_time: 17:36
     **/
    public boolean canPermutePalindrome(String s) {

        if (s == null || s.length() <= 1) {
            return true;
        }
        char[] arr = s.toCharArray();
        String str = "";
        for (char t : arr) {
            String temp = String.valueOf(t);
            str = str.contains(temp) ? str.replace(temp, "") : str.concat(temp);
        }

        return str.length() <= 1;
    }
}
