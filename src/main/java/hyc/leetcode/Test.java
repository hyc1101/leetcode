package hyc.leetcode;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

/**
 * @author: hyc
 * @time: 2019/12/18 17:45
 */
public class Test {

    public static void main(String[] args) {
//        int i = 1;
//        Integer x = new Integer(1);
//        Integer x1 = new Integer(1);
//
//        System.out.println(x ==1);
//        System.out.println(x.equals(i));
//
//        System.out.println(x == x1);
//
//        short s = 1;
//
//        System.out.println(i == s);
//
//        System.out.println(x.equals(s));
//
//
//        System.out.println("==================double");
//        double d = 1.0d;
////        System.out.println(i ==d);
//        BigDecimal b1 = new BigDecimal(12345).movePointLeft(3);
//        BigDecimal b2 = new BigDecimal(12345).movePointLeft(3);
//
//        System.out.println(b1.multiply(b2).movePointRight(3).intValue());
//
//        String fileName = "1报价单列表_R01.xlsx1报价单列表_R01.xlsx";
//        System.out.println(System.currentTimeMillis() + fileName.substring(fileName.indexOf(".")));
        int n1 = 1000;
        int n2 = 1000;
        System.out.println(n1/10000*n2);
        System.out.println(mul(n1,n2));

        System.out.println(div(86,83)*12);

        System.out.println(div(1032,996)+1000);
        System.out.println(div(86,83)+1000);
        System.out.println((86/83));
        System.out.println((86/83)*1000);


    }

    private static  int mul(int n1, int n2) {

        BigDecimal b1 = new BigDecimal(n1).movePointLeft(3);
        BigDecimal b2 = new BigDecimal(n2).movePointLeft(3);
        return b1.multiply(b2).setScale(3, BigDecimal.ROUND_HALF_UP).movePointRight(3).intValue();
    }

    private static int div(int n1, int n2) {

        BigDecimal b1 = new BigDecimal(n1).movePointLeft(3);
        BigDecimal b2 = new BigDecimal(n2).movePointLeft(3);
        return b1.divide(b2, 3, BigDecimal.ROUND_HALF_UP).movePointRight(3).intValue();
    }
}
