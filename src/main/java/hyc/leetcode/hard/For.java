package hyc.leetcode.hard;

import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.concurrent.TimeUnit;

/**
 * @author: hyc
 * @time: 2020/5/18 17:47
 */
public class For {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < 10000000; i++) {
            list.add(i);
        }

        long x = 0;
        long l = System.currentTimeMillis();
        for (Integer integer : list) {
             x+= integer;
        }
        System.out.println(System.currentTimeMillis() - l);
        System.out.println(x);

        l = System.currentTimeMillis();
        x = list.parallelStream().mapToLong(i->i).sum();
        System.out.println(System.currentTimeMillis() - l);
        System.out.println(x);

        l = System.currentTimeMillis();
        x = list.stream().parallel().mapToLong(i->i).sum();
        System.out.println(System.currentTimeMillis() - l);
        System.out.println(x);




    }
}
