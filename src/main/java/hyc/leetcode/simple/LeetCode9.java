package hyc.leetcode.simple;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: hyc
 * @time: 2019/12/18 20:28
 */
public class LeetCode9 {

    public static void main(String[] args) {
        System.out.println(isPalindrome(121));
    }
    public static boolean isPalindrome(int x) {

        if (x <= 0) {
            return false;
        }
        int s = 0;
        while (x >= 1) {
            s = s * 10 + x % 10;
            x = x / 10;
        }
        if (s == x){
            return true;
        }else {
            return  false;
        }

    }

    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode result;
        List<ListNode> list = new ArrayList<>();
        while(head != null){
            list.add(head);
            head = head.next;
        }
        int max = list.size();
        if(n == 0){
            return list.get(1);
        }
        if(n == max -1){
            result = list.get(n-1);
            result.next = null;
            return result;
        }

        result = list.get(max - n -1 );
        result.next = list.get(max - n +1);
        return result;
    }
}
