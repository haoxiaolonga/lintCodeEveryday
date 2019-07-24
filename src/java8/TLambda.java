package java8;

import java.util.Comparator;

/**
*@ClassName TLambda
*@Description  labmbda表达式：也可称为闭包
 *                            Lambda 允许把函数作为一个方法的参数（函数作为参数传递进方法中）
 * 1.可选类型声明：不需要声明参数类型，编译器可以统一识别参数值。
 * 2.可选的参数圆括号：一个参数无需定义圆括号，但多个参数需要定义圆括号。
 * 3.可选的大括号：如果主体包含了一个语句，就不需要使用大括号。
 * 4.可选的返回关键字：如果主体只有一个表达式返回值则编译器会自动返回值，大括号需要指定明表达式返回了一个数值。
*@Author haoxl
*@Date 2019/7/24 9:53
*/
public class TLambda {
        public static void main(String args[]){
            TLambda tester = new TLambda();

            // 类型声明
            MathOperation addition = (int a, int b) -> a + b;

            // 不用类型声明
            MathOperation subtraction = (a, b) -> a - b;

            // 大括号中的返回语句
            MathOperation multiplication = (int a, int b) -> { return a * b; };

            // 没有大括号及返回语句
            MathOperation division = (int a, int b) -> a / b;

            System.out.println("10 + 5 = " + tester.operate(10, 5, addition));
            System.out.println("10 - 5 = " + tester.operate(10, 5, subtraction));
            System.out.println("10 x 5 = " + tester.operate(10, 5, multiplication));
            System.out.println("10 / 5 = " + tester.operate(10, 5, division));

            // 不用括号
            GreetingService greetService1 = message ->
                    System.out.println("Hello " + message);

            // 用括号
            GreetingService greetService2 = (message) ->
                    System.out.println("Hello " + message);

            greetService1.sayMessage("Runoob");
            greetService2.sayMessage("Google");


            //局部变量(lambda表达式中的局部变量不可以修改，类似于final)
            String var = "test123";
            GreetingService greetService3 = message ->{
                System.out.println(var + message);
            };
            greetService1.sayMessage("Runoob");

            String first = "";
//            在 Lambda 表达式当中不允许声明一个与局部变量同名的参数或者局部变量。
//            Comparator<String> comparator = (first, second) -> Integer.compare(first.length(), second.length());  //编译会出错

        }

        interface MathOperation {
            int operation(int a, int b);
        }

        interface GreetingService {
            void sayMessage(String message);
        }

        /**
         * 函数式接口
         * @param a
         * @param b
         * @param mathOperation
         * @return
         */
        private int operate(int a, int b, MathOperation mathOperation){
            return mathOperation.operation(a, b);
        }
    }
