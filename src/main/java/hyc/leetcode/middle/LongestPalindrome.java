package hyc.leetcode.middle;

/**
 * 暴力破击
 *
 * @author: hyc
 * @time: 2020/6/29 11:32
 */
public class LongestPalindrome {
    public static void main(String[] args) {
        System.out.println(longestPalindrome("ab"));
        System.out.println(longestPalindrome("bb"));
        System.out.println(longestPalindrome("babad"));
        System.out.println(longestPalindrome("cbbd"));
        System.out.println(longestPalindrome("b11b2"));
        System.out.println(longestPalindrome("b1b2b"));
        System.out.println(longestPalindrome("bxxxxb"));
        System.out.println(longestPalindrome("1bxxxxb"));
        System.out.println(longestPalindrome("1bxxxxbfasfsafsafxxxxfsafsxcasfsdfcvsadfsadb avdsasa;jdvlkdsvcsadfma;ldsjvpodsiqutwegnldsvdsajoyvhsjgshafl"));


    }

    public static String longestPalindrome(String s) {
        if (null == s) {
            return "";
        }
        int length = s.length();
        if (length < 2) {
            return s;
        }
        char[] sArray = s.toCharArray();
        int maxLen = 0;
        int begin = 0;
        for (int i = 0; i < length; i++) {
            int len1 = calcPalindrome(sArray, i, i);
            int len2 = calcPalindrome(sArray, i, i + 1);
            int len = len1 > len2 ? len1 : len2;
            if (len > maxLen) {
                begin = i - ((len - 1) / 2);
                maxLen = len;
            }
            if (maxLen - 1 >= (length - i - 1) * 2) {
                break;
            }
        }
        return s.substring(begin, begin + maxLen);
    }

    public static int calcPalindrome(char[] sArray, int begin, int end) {

        while (begin >= 0 && end < sArray.length && sArray[end] == sArray[begin]) {
            end++;
            begin--;
        }
        return end - begin - 1;
    }
}
