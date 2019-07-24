package java8;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

/**
*@ClassName Stream
*@Description  测试流
 *
 * Stream（流）是一个来自数据源的元素队列并支持聚合操作
 * 元素是特定类型的对象，形成一个队列。 Java中的Stream并不会存储元素，而是按需计算
 * 数据源 流的来源。 可以是集合，数组，I/O channel， 产生器generator
 * 聚合操作 类似SQL语句一样的操作， 比如filter, map, reduce, find, match, sorted等
 *
 * 基础特征：
 *          Pipelining: 中间操作都会返回流对象本身。 这样多个操作可以串联成一个管道， 如同流式风格（fluent style）
 *          内部迭代： 以前对集合遍历都是通过Iterator或者For-Each的方式, 显式的在集合外部进行迭代， 这叫做外部迭代。
 *          Stream提供了内部迭代的方式， 通过访问者模式(Visitor)实现
 *
 * stream()是串行流
 * parallelStream()是并行流
 *
 *
*@Author haoxl
*@Date 2019/7/24 14:13
*/
public class Stream {


    public static void main(String[] args) {

        Random random = new Random();
        //特性直接foreach
        // limit 方法用于获取指定数量的流。 以下代码片段使用 limit 方法打印出 10 条数据：
        random.ints().limit(10).forEach(System.out::println);

        //特性Map
        List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);
        //每一个数的平方
        List<Integer> squaresList = numbers.stream().map(i -> i*i).distinct().collect(Collectors.toList());

        List<String>strings = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");
        // 获取空字符串的数量
        long count = strings.stream().filter(string -> string.isEmpty()).count();

//        sorted 方法用于对流进行排序
        random.ints().limit(10).sorted().forEach(System.out::println);

//        parallelStream 是流并行处理程序的代替方法
        count = strings.parallelStream().filter(string -> string.isEmpty()).count();

//        Collectors 类实现了很多归约操作，例如将流转换成集合和聚合元素。Collectors 可用于返回列表或字符串：
        //常用来转list,map等
        List<String> filtered = strings.stream().filter(string -> !string.isEmpty()).collect(Collectors.toList());
        System.out.println("筛选列表: " + filtered);
        String mergedString = strings.stream().filter(string -> !string.isEmpty()).collect(Collectors.joining(", "));
        System.out.println("合并字符串: " + mergedString);

//        另外，一些产生统计结果的收集器也非常有用
        List<Integer> numberss = Arrays.asList(3, 2, 2, 3, 7, 3, 5);
        IntSummaryStatistics stats = numberss.stream().mapToInt((x) -> x).summaryStatistics();

        System.out.println("列表中最大的数 : " + stats.getMax());
        System.out.println("列表中最小的数 : " + stats.getMin());
        System.out.println("所有数之和 : " + stats.getSum());
        System.out.println("平均数 : " + stats.getAverage());

    }


}
