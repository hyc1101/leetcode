package hyc.leetcode.simple;

/**
 * @author: hyc
 * @time: 2019/11/22 16:01
 */
public class Leetcode4 {


    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int len1 = nums1.length;
        int len2 = nums2.length;
        int s1 = 0;
        int s2 = 0;
        int index = 0;
        int n1 = 0;
        int n2 = 0;
        boolean is1 = s1 < len1;
        boolean is2 = s2 < len2;
        int m = (len1 + len2) / 2;
        boolean isEven = ((len1 + len2) % 2 == 0);
        int sumNum = 0;
        while ((is1 || is2) && index <= m) {
            if (!is1) {
                n2 = nums2[s2];
                if (isEven && index == (m - 1)) {
                    sumNum += n2;
                }
                if (index == m) {
                    sumNum += n2;
                    break;
                }
                index++;
                s2++;
                is2 = s2 < len2;
                continue;
            }
            if (!is2) {
                n1 = nums1[s1];
                if (isEven && index == (m - 1)) {
                    sumNum += n1;
                }
                if (index == m) {
                    sumNum += n1;
                    break;
                }
                index++;
                s1++;
                is1 = s1 < len1;
                continue;
            }

            n1 = nums1[s1];
            n2 = nums2[s2];
            int s = 0;
            if (n1 < n2) {
                s = n1;
                s1++;
            } else {
                s = n2;
                s2++;
            }
            if (isEven && index == (m - 1)) {
                sumNum += s;
            }
            if (index == m) {
                sumNum += s;
                break;
            }
            index++;
            is1 = s1 < len1;
            is2 = s2 < len2;
        }
        if (isEven) {
            return sumNum / 2.0;
        } else {
            return sumNum / 1.0;
        }
    }
}
