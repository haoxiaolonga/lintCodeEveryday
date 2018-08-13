package tij.chapter11;

import java.util.*;

/**
 * class_name: AddingGroups
 * package: tij.chapter11
 * describe: 测试快速创建list
 * creat_user: haoxiaol
 * creat_date: 2018/8/10
 * creat_time: 10:01
 **/
public class AddingGroups {

    public static void main(String[] args) {

        Collection<Integer> col = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        Integer[] moreInts = {5,4,3,2,1};
        col.addAll(Arrays.asList(moreInts));

        Collections.addAll(col,6,7,8,9,10);

        Collections.addAll(col,moreInts);

        System.out.println(col);

        List<Integer> t = Arrays.asList(1,2,3,4);
        //用上述方式直接产生的list不能增加add和删除delete，底层为数组，可能会改变大小，所以抛出异常
//        t.add(1);

        Map<String , String> tmap = new HashMap<String , String>(){{
            put("one","1");
            put("Two","1");
            put("Thew","1");
        }};

        Map<String , String> tmap1 = new HashMap<>();
        tmap1.putAll(tmap);

        System.out.println(tmap1);
        System.out.println(tmap);

        List<Integer> list1 = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5));

        //子集
        List<Integer> subList = list1.subList(0,1);
        System.out.println(subList);
        subList.add(12);

        //子集变化，父集也会变化
        System.out.println(subList);
        System.out.println(list1);
        Collections.sort(list1);
        System.out.println(list1);


    }

}
