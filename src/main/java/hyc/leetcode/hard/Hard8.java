package hyc.leetcode.hard;

/**
 * @author: hyc
 * @time: 2019/12/18 19:11
 */
public class Hard8 {
    public static void main(String[] args) {
        System.out.println(myAtoi("   x4123131333333132"));
    }
    public static int myAtoi(String str) {
        long i = 0;
        boolean isF = false;
        for (Character c : str.toCharArray()) {
            if (c == ' ' && i == 0) {
                continue;
            }
            if (i ==0 && c == '-'){
                isF = true;
                continue;
            }
            if (c < '0' || c > '9') {
                break;
            }
            if (isF){
                i = i * 10 - (c-48);
            }else {
                i = i * 10 + (c-48);
            }
            if (i <= Integer.MIN_VALUE) {
                return Integer.MIN_VALUE;
            }
            if (i >= Integer.MAX_VALUE) {
                return Integer.MAX_VALUE;
            }
        }
        return (int) i;
    }
}
