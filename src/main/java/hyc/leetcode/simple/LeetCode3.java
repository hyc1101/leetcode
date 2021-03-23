package hyc.leetcode.simple;

import java.util.HashMap;
import java.util.Map;

/**
 * 给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。
 *
 * @author: hyc
 * @time: 2019/11/22 10:45
 */
public class LeetCode3 {
    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("ckilbkd"));
    }

    public static int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int start = 0;
        int end = 0;
        int max = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            Integer index = map.get(c);
            if (index != null && index >= start) {
                int maxTemp = i - start;
                if (maxTemp > max) {
                    max = maxTemp;
                }
                if (index + 1 < i) {
                    start = index + 1;
                } else {
                    start = i;
                }
            } else {
                end = i;
            }
            map.put(c, i);

        }
        if (end == s.length() - 1) {
            int maxTemp = end + 1 - start;
            if (maxTemp > max) {
                max = maxTemp;
            }
        }
        return max;
    }
}
