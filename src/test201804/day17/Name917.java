package test201804.day17;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * class_name: Name917
 * package: test201804.day17
 * describe: flag game 替换++ 为 -- 计算有好多个结果
 * creat_user: haoxiaol
 * creat_date: 2018/4/17
 * creat_time: 17:15
 **/
public class Name917 {


    @Test
    public void testNext() {
        String param = "++++";
        List<String> res = generatePossibleNextMoves(param);
        for (String  t : res) {
            System.out.println(t);
        }
    }

    public List<String> generatePossibleNextMoves(String s) {
        
        /**
         * method_name: generatePossibleNextMoves
         * param: [s]
         * param: java.util.List<java.lang.String>
         * describe:  you and your friend take turns to flip two consecutive "++" into "--",
         *If there is no valid move, return an empty list [].
         * creat_user: haoxiaol
         * creat_date: 2018/4/17
         * creat_time: 17:16
         **/ 
        List<String> res = new ArrayList<String>();
        if (s == null || s.length() < 2) {
            return res;
        }
        int index = 0;
        int max = s.length();
        while (index + 2 <= max ) {
            String temp = s.substring(index,index + 2);
            if ("++".equals(temp)){
                res.add(s.substring(0, index).concat("--").concat(s.substring(index + 2, max)));
            }
            index ++;
        }
        return res;
    }
}
