package optional;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestStream {


    public static void main(String[] args){

        List<String> datas = Stream.of("1","2","3","4","5").collect(Collectors.toList());

        final String res = "12345";
        Optional<String> test = datas.stream().filter(t-> t.indexOf(res) >0).findFirst();
        System.out.println(test.isPresent());

        Optional<String> test1 = Optional.of("123");
        System.out.println(test1.isPresent() + "测试optionalof" + test1.get());
        try {
            test1 = Optional.of(null);
            System.out.println(test1.isPresent() + "测试optional" + test1.get());
        } catch (Exception e) {
            System.out.println(" Optional.of不可接受NULL");
        }

        test1 = Optional.ofNullable(null); //等价于empty();
        try{
            System.out.println(test1.isPresent() + "测试optional_ofnullable" );
        }catch (Exception e) {
            System.out.println(" Optional.ofNullable可接受NULL,调用empty方法");
        }

        test1 = Optional.empty();
        try{
            System.out.println(test1.isPresent() + "测试optional_empty" );
        }catch (Exception e) {
            System.out.println(" Optional.ofNullable可接受NULL,调用empty方法");
        }

        /* optinal常用的方法  */
//        1. ifPresent
        Optional<Object> t = Optional.ofNullable(new Object());
        t.ifPresent(u -> u.toString()); //如果存在值，那么执行方法体

        //2.orElse 如果 Optional中有值则将其返回，否则返回 orElse 方法传入的参数。
        Object t1 = Optional.empty().orElse("123");
        System.out.println(Optional.of(t1).isPresent());
        t.ifPresent(u-> System.out.println(u));

        //Optional.orElseGet  //不同于起返回接口函数值
        t1 = Optional.empty().orElseGet(()->"123");
        System.out.println(Optional.of(t1).isPresent());
        t.ifPresent(u-> System.out.println(u));

        //Optional.orElseThrow //不存在则抛出异常
        try{
            t1 = Optional.ofNullable(null).orElseThrow(()-> new RuntimeException("未知的数据项"));
        } catch (Exception e){
            System.out.println(e.getMessage());
        }

        //Optional.map //对非null值optional进行数据调整
        Optional<String> tt = Optional.ofNullable(new String())
                .map(u->"213").map(u-> u+"000");
        tt.ifPresent(u-> System.out.println(u));

        //Optional.flatMap //可返回一个新的optional,而不是简单对值修改
        Optional<String> tt1 = Optional.ofNullable(new String())
                .flatMap(u-> Optional.of(u.toLowerCase()));


        //Optional.filter  如果包含的值满足条件，那么还是返回这个Optional；否则返回 Optional.empty。
        Optional<String> f = Optional.ofNullable(new String())
                .filter(u -> u.equals("123")).map(u->"321");

        //optional配合Stream使用


    }


}
