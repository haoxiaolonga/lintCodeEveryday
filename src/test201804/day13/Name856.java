package test201804.day13;

import org.junit.Test;

import java.util.*;

/**
 * class_name: Name856
 * package: test201804.day13
 * describe: 检查两个句子是否相似，根据list中的字符串对比较
 * creat_user: haoxiaol
 * creat_date: 2018/4/13
 * creat_time: 11:33
 **/
public class Name856 {


    @Test
    public void testMethod() {
        String[] words1 = {"great", "acting", "skills"};
        String[] words2 = {"fine", "drama", "talent"};
        List<String> one = Arrays.asList(new String[]{"great", "fine"});
        List<String> two = Arrays.asList(new String[]{"acting","drama"});
        List<String> three = Arrays.asList(new String[]{"skills","talent"});
        List<List<String>> pairs = new ArrayList<List<String>>();
        pairs.add(one); pairs.add(two); pairs.add(three);

        System.out.println(isSentenceSimilarity(words1, words2, pairs));
    }

    /**
     * method_name: putMapEnum
     * param: [f, l, matchMap]
     * param: void
     * describe: 向map中推入元素
     * creat_user: haoxiaol
     * creat_date: 2018/4/13
     * creat_time: 11:36
     **/
    public void putMapEnum(String f, String l, Map<String,String> matchMap) {

        if (matchMap.containsKey(f)) {
            if (!matchMap.get(f).contains(l)) {
                matchMap.put(f, matchMap.get(f).concat(l));
            }
        } else {
            matchMap.put(f, l);
        }
    }

    /**
     * method_name: isSentenceSimilarity
     * param: [words1, words2, pairs]
     * param: boolean
     * describe: 主方法，比较是否相似
     * creat_user: haoxiaol
     * creat_date: 2018/4/13
     * creat_time: 11:35
     **/
    public boolean isSentenceSimilarity(String[] words1, String[] words2, List<List<String>> pairs) {

        if (words1.length != words2.length) {
            return false;
        }
        Map<String,String> matchMap = new HashMap<String,String>();
        for (List<String> t : pairs) {
            String f = t.get(0);
            String l = t.get(1);
            putMapEnum(f, l, matchMap);
            putMapEnum(l, f, matchMap);
        }

        boolean bool = true;
        for(int i = 0; i < words1.length; i ++) {
            if (!words1[i] .equals(words2[i])) {
                if (matchMap.containsKey(words1[i])){
                    if (!matchMap.get(words1[i]).contains(words2[i])) {
                        bool = false;
                        break;
                    }
                } else {
                    bool = false;
                    break;
                }
            }
        }
        return bool;
    }
}
