package hyc.leetcode.simple;

import java.util.HashMap;
import java.util.Map;

/**
 * @author: hyc
 * @time: 2019/11/20 11:34
 */
public class Simple1 {

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numMap = new HashMap();
        int length = nums.length;
        int[] result = new int[2];
        for (int i = 0; i < length; i++) {
            int num = nums[i];
            if (num > target) {
                continue;
            }
            Integer i1 = numMap.get(target- num);
            if (i1 != null) {
                result[0] = i1;
                result[1] = i;
                return result;
            } else {
                numMap.put(num, i);
            }
        }
        return result;
    }
}
