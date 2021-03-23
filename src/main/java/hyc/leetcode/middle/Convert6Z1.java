package hyc.leetcode.middle;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: hyc
 * @time: 2020/7/3 15:47
 */
public class Convert6Z1 {

    public static void main(String[] args) {
        System.out.println(convert("a", 1));
        System.out.println(convert("ab", 1));
        System.out.println(convert("abcdefghijk", 4));
    }

    public static String convert(String s, int numRows) {
        int len = s.length();
        if (numRows >= len || numRows == 1) {
            return s;
        }
        List<StringBuilder> list = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            list.add(new StringBuilder());
        }
        int index = 0;
        char[] chars = s.toCharArray();
        int diff = 1;
        for (int i = 0; i < len; i++) {
            list.get(index).append(chars[i]);
            if (index == 0) {
                diff = 1;
            } else if (index == numRows - 1) {
                diff = -1;
            }
            index += diff;
        }

        StringBuilder result = new StringBuilder();
        for (StringBuilder ss : list) {
            result.append(ss);
        }
        return result.toString();

    }
}
