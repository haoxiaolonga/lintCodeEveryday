package tij.chapter12;

/**
 * class_name: MyException
 * package: tij.chapter12
 * describe: 自定义异常测试
 * creat_user: haoxiaol
 * creat_date: 2018/8/13
 * creat_time: 15:32
 **/
public class MyException extends Exception {

    private String message;

    public MyException() {}

    public MyException(String remark) {
        this.message = remark;
    }

    public String getMessage() {
        return message;
    }

}
