package hyc.leetcode.middle;

/**
 * @author: hyc
 * @time: 2020/6/29 11:32
 */
public class LongestPalindrome1 {
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
        int length = s.length();
        if (length < 2) {
            return s;
        }
        char[] sArray = s.toCharArray();
        int maxLen = 0;
        int begin = 0;

        for (int i = 0; i < length; i++) {
            for (int j = length - 1; j >= i; j--) {
                if (j - i + 1 > maxLen && isPalindrome(sArray, i, j)) {
                    maxLen = j - i + 1;
                    begin = i;
                    break;
                }
            }
            if (maxLen >= (length - i)){
                break;
            }
        }
        return s.substring(begin, begin + maxLen);
    }

    public static boolean isPalindrome(char[] sArray, int begin, int end) {

        while (end > begin) {
            if (sArray[end] != sArray[begin]) {
                return false;
            }
            end--;
            begin++;
        }
        return true;
    }
}
