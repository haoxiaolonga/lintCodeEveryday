package tij.chapter11;

import java.util.ArrayList;
import java.util.List;

/**
 * class_name: Exercise1
 * package: tij.chapter11
 * describe: 练习1
 * creat_user: haoxiaol
 * creat_date: 2018/8/10
 * creat_time: 9:43
 **/
public class Exercise1 {

    private int num;

    Exercise1(int num) {
        this.num = num;
    }

    int hop(){
        return num;
    }

    public static class testMain {

        public static void main(String[] args) {

            List<Exercise1> list = new ArrayList<>(5);
            while(true) {
                list.add(new Exercise1(list.size()));
                if(list.size() == 5) {
                    break;
                }
            }

            for(Exercise1 t : list) {
                System.out.println(t.hop());
            }

        }
    }


}
