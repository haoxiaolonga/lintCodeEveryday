package java8;

import org.junit.Test;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

/**
*@ClassName NashornJavaScript
*@Description  java8新增一个js引擎
 *
 * jjs是个基于Nashorn引擎的命令行工具。它接受一些JavaScript源代码为参数
 *
 *
*@Author haoxl
*@Date 2019/7/24 14:39
*/
public class NashornJavaScript {


    //使用 ScriptEngineManager, JavaScript 代码可以在 Java 中执行
    @Test
    public void testJavaJs(){

        ScriptEngineManager scriptEngineManager = new ScriptEngineManager();
        ScriptEngine nashorn = scriptEngineManager.getEngineByName("nashorn");

        String name = "Runoob";
        Integer result = null;

        try {
            nashorn.eval("print('" + name + "')");
            result = (Integer) nashorn.eval("10 + 2");

        }catch(ScriptException e){
            System.out.println("执行脚本错误: "+ e.getMessage());
        }

        System.out.println(result.toString());
    }

    //JavaScript 中调用 Java
    //jjs的js中的写法：
    /*
        var BigDecimal = Java.type('java.math.BigDecimal');

        function calculate(amount, percentage) {

            var result = new BigDecimal(amount).multiply(
                    new BigDecimal(percentage)).divide(new BigDecimal("100"), 2, BigDecimal.ROUND_HALF_EVEN);

            return result.toPlainString();
        }

        var result = calculate(568000000000000000023,13.9);
        print(result);
    */


}
