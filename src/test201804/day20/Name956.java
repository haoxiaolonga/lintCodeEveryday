package test201804.day20;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * class_name: Name956
 * package: test201804.day20
 * describe: 956数据分割
 * creat_user: haoxiaol
 * creat_date: 2018/4/20
 * creat_time: 10:31
 **/
public class Name956 {
    @Test
    public void TestSplite() {
        String temp = "(hi (i am)bye)";
        String[] res = dataSegmentation(temp);
        for (String t : res) {
            System.out.print(t + ",");
        }
    }

    /**
     * method_name: dataSegmentation
     * param: [str]
     * param: java.lang.String[]
     * describe: 给出一个字符串 str,你需要按顺序提取出该字符串的符号和单词。
     * creat_user: haoxiaol
     * creat_date: 2018/4/20
     * creat_time: 10:32
     **/
    public String[] dataSegmentation(String str) {

        //str长度不会超过10000。
//		字符串只包含小写字母，符号和空格
        List<String> res = new ArrayList<String>();
        if (str == null) {
            return res.toArray(new String[res.size()]);
        }
        str = str.trim();
        str = str.concat(" ");//加入一个空格，避免最后一个单词不入list
        char[] strArr = str.toCharArray();
        StringBuilder strBuf = new StringBuilder();
        for (char a : strArr) {
            if (97 <= a && a <= 122) {//是否为小写字母
                strBuf.append(a);
            } else { 		//为符号或者空格
                if (strBuf.length() > 0) { //先装入单词
                    res.add(strBuf.toString());
                    strBuf.setLength(0);
                }
                if(!String.valueOf(a).equals(" ")){ //是符号
                    res.add(String.valueOf(a));
                }
            }
        }
        return res.toArray(new String[res.size()]);
    }
}
