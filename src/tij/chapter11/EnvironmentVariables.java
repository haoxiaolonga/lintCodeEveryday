package tij.chapter11;

import java.util.Map;

/**
 * class_name: EnvironmentVariables
 * package: tij.chapter11
 * describe: 简单获取环境变量，for循环map
 * creat_user: haoxiaol
 * creat_date: 2018/8/13
 * creat_time: 14:05
 **/
public class EnvironmentVariables {

    public static class inner{
        public static void main(String[] args) {

           for(Map.Entry entry : System.getenv().entrySet()) {
               System.out.println(entry.getKey() + "---" + entry.getValue());
           }

        }
    }
}
