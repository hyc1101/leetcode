//package hyc.leetcode.middle;
//
///**
// * @author: hyc
// * @time: 2020/7/3 15:47
// */
//public class Convert6Z {
//
//    public static void main(String[] args) {
//        System.out.println(convert("a", 1));
//        System.out.println(convert("ab", 1));
//        System.out.println(convert("abcdefghijk", 4));
//    }
//
//    public static String convert(String s, int numRows) {
//
//        if (numRows <= 1) {
//            return s;
//        }
//        StringBuilder result = new StringBuilder();
//        char[] chars = s.toCharArray();
//        char[] ret = new char[chars.length];
//        int period = chars.length / (numRows * 2 - 2);
//        for (int i = 0; i < chars.length; i++) {
//            int row = i / numRows;
//            int c = i % numRows;
//            int index = row * numRows +
//        }
//        return new String(ret);
//
//    }
//}
