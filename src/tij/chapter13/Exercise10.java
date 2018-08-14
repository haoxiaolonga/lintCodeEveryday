package tij.chapter13;

/**
 * class_name: Exercise10
 * package: tij.chapter13
 * describe: 联系10
 * creat_user: haoxiaol
 * creat_date: 2018/8/14
 * creat_time: 15:24
 **/
public class Exercise10 {

    public static void main(String[] args) {
        String temp = "java now has regular Expressions";
        int i = 0;
        for (String t : new String[]{
                "^java","\\Breg.*","n.w\\S+h(a|i)s","s?","s*","s+","s{4}","s{1}.","s{0,3}"
        }) {
            System.out.println(i + "__" + temp.matches(t));
            i++;
        }
    }
}
