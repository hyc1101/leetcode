package hyc.leetcode.hard;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: hyc
 * @time: 2020/3/26 18:24
 */
public class ListTest {

    public static void main(String[] args) {

        List<Short> list = new ArrayList<>();

        list.add((short) 10);

        list.add((short) 20);

        list.add((short) 30);
        list.remove(Short.valueOf("20"));
        System.out.println(list);
    }
}
