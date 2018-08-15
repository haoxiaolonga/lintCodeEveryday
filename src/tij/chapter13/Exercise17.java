package tij.chapter13;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * class_name: Exercise17
 * package: tij.chapter13
 * describe: 获取一个文件中的所有注释
 * creat_user: haoxiaol
 * creat_date: 2018/8/14
 * creat_time: 17:10
 **/
public class Exercise17 {

    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);

//        String str = in.next();
        String str = "G:\\GIT\\repository1\\lintCodeEveryday\\src\\tij\\chapter13\\Exercise10.java";
        try {
            BufferedReader br = new BufferedReader(new FileReader(str));
            try {
                //读入一行
                String line = null;
                //联系17
                Pattern p = Pattern.compile("^[/**|*|//].*", Pattern.MULTILINE);
                //练习18
                Pattern p2 = Pattern.compile("[\"].*[\"]",Pattern.MULTILINE);
                //练习19
                Pattern p3 = Pattern.compile("",Pattern.MULTILINE);

                Matcher m = p.matcher("");
                Matcher m2 = p2.matcher("");
                Matcher m3 = p3.matcher("");

                while (null != (line = br.readLine())) {
                    line = line.trim();
                    m.reset(line);
                    while (m.find()) {
                        System.out.println(m.group());
                    }

                    m2.reset(line);
                    while (m2.find()) {
                        System.out.println("字符串" + m2.group());
                    }
                }

            } catch (Exception e) {
                System.out.println("读取文件出现异常");
            } finally {
                br.close();
            }
        } catch (FileNotFoundException e) {
            System.out.println("没有找到文件");

        } catch (Exception e) {
            System.out.println("创建文件流失败");
        }

    }
}
