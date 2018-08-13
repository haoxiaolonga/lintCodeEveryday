package tij.chapter12;

/**
 * class_name: WhileException
 * package: tij.chapter12
 * describe: while+try 恢复模型--知道不再抛出异常
 * creat_user: haoxiaol
 * creat_date: 2018/8/13
 * creat_time: 16:09
 **/
public class WhileException {


    public static void main(String[] args) {
        int n = 1;
        while(true) {
            try {
                if(n == 10) {
                    System.out.println("满足条件，退出");
                    break;
                } else {
                    throw new Exception();
                }
            } catch (Exception e) {
                System.out.println("抛出异常");
                n ++;
            }
        }
        System.out.println(n);
    }

}
