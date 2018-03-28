package test201803.day28;

/**
 * class_name: Name720
 * package: test201803.day28
 * describe: Lintcode 720
 * creat_user: haoxiaol
 * creat_date: 2018/3/28
 * creat_time: 9:37
 **/
public class Name720 {
    public static void main(String[] args) {

    }
    /**
     * method_name: rearrange
     * param: [str]
     * param: java.lang.String
     * describe: 字母按字母表的顺序排列, 接着是整数的和
     * creat_user: haoxiaol
     * creat_date: 2018/3/28
     * creat_time: 9:39
     **/
    public static String rearrange(String str) {

        // Write your code here
        if (str == null || str.length() == 0 || str.length() == 1) {
            return str;
        }
        StringBuffer res = new StringBuffer();
        Integer addValue = null;
        for(int i = 0; i < str.length(); i ++) {
            String temp = String.valueOf(str.charAt(i));
// 			if (Pattern.matches("[0-9]", temp)) {  //如果是数字
            if ("0123456789".contains(temp)) {
                if (addValue == null) {
                    addValue = new Integer(0);
                }
                addValue +=Integer.valueOf(temp);
                continue;
            }
            if (res.length() == 0) {
                res.append(temp);
                continue;
            }
            int index = res.indexOf(temp);
            if (index >= 0) {
                res.insert(index, temp);
            } else {//比较排序
                for (int j = res.length() - 1; j >= 0; j --) {
                    if (Integer.valueOf(res.charAt(j)) <= Integer.valueOf(temp.charAt(0))) {
                        if (j != res.length() - 1) { //中间
                            res.insert(j + 1, temp);
                        } else{ //最后
                            res.append(temp);
                        }
                        break;
                    }
                    if ( j == 0) { /* 都大，则加在最前面 */
                        res.insert(0, temp);
                    }
                }
            }
        }
        if (addValue != null) {
            return res.append(addValue).toString();
        }
        return res.toString();

    }
}
