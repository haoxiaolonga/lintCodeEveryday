package test201803.day27;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * 三跳之内的朋友
 */
public class Name932 {

    public static  void main(String[] args) {
        int[] a = {1,2,3,4};
        int[] b = {2,3,4,5};
        int[] c = {1,1};
        int[] d = {4,5};
        int[] res = withinThreeJumps(a,b,c,d);
        System.out.println(res[0] + "和" + res[1]);
    }


    /**
     *
     * @param a
     * @param b
     * @param c
     * @param d
     * @return
     */
    public static int[] withinThreeJumps(int[] a, int[] b, int[] c, int[] d) {
        // Write your code here

        if (c.length != d.length) return new int[]{};
        if (c.length == 0 || d.length == 0) return new int[]{};
        int[] res= new int[c.length];
        Map<Integer,Set<Integer>> map = new HashMap<Integer, Set<Integer>>();
        for (int i = 0; i < a.length; i ++) { //遍历出各自对应
            int temp = a[i];
            int tempWith = b[i];
            Set<Integer> valueExist = map.containsKey(a[i]) ? map.get(temp) : new HashSet<Integer>();
            valueExist.add(tempWith);
            map.put(temp, valueExist);
            Set<Integer> valueExistFx = map.containsKey(tempWith) ? map.get(tempWith) : new HashSet<Integer>();
            valueExistFx.add(temp);
            map.put(tempWith, valueExistFx);
        }
        for (int j = 0; j < c.length; j ++) { //便利寻找
            int reqValue = c[j];
            int resValue = d[j];
            Set<Integer> resSetOne = map.get(reqValue);
            if (resSetOne == null) continue;
            if (resSetOne.contains(resValue)) {//一阶
                res[j] = 1;
                continue;
            }
            Set<Integer> resSetTwo = new HashSet<Integer>();
            if (resSetOne.isEmpty()) continue;
            for (Integer value : resSetOne) { //2街朋友
                if (map.containsKey(value)) {
                    resSetTwo.addAll(map.get(value));
                    if (resSetTwo.contains(resValue)) {//2阶
                        res[j] = 1;
                        break;
                    }
                }
            }
            if (res[j] > 0) continue;
            for (Integer value : resSetTwo) { //3街朋友
                if (map.containsKey(value)) {
                    if (map.get(value).contains(resValue)) {//3阶
                        res[j] = 1;
                        break;
                    }
                }
            }
        }
        return res;
    }
}
