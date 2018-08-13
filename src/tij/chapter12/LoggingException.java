package tij.chapter12;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.logging.Logger;

/**
 * class_name: LoggingException
 * package: tij.chapter12
 * describe: 日志类异常捕获
 * creat_user: haoxiaol
 * creat_date: 2018/8/13
 * creat_time: 16:21
 **/
public class LoggingException extends Exception {

    public static Logger logger = Logger.getLogger("LoggingException");

    public LoggingException() {
        StringWriter trace = new StringWriter();

        printStackTrace(new PrintWriter(trace));

        logger.severe(trace.toString());
    }

}
