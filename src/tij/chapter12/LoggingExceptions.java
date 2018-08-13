package tij.chapter12;

/**
 * class_name: LoggingExceptions
 * package: tij.chapter12
 * describe: 测试日志打印
 * creat_user: haoxiaol
 * creat_date: 2018/8/13
 * creat_time: 16:26
 **/
public class LoggingExceptions {

    public static void main(String[] args) {


        try {
            throw new LoggingException();
        } catch (LoggingException e ) {
            System.err.println("err" + e);
        }

        try {
            throw new LoggingException();
        } catch (LoggingException e ) {
            System.err.println("err" + e);
        }
    }
}
