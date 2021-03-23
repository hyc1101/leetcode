package hyc.leetcode.simple;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author: hyc
 * @time: 2019/11/20 11:34
 */
public class Simple2 {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode relust = new ListNode(0);
        ListNode x = l1,y = l2,c = relust;
        int tempsum = 0;
        while (x != null || y != null){
            int sum = tempsum;
            if(x != null){
                sum += x.val;
                x = x.next;
            }
            if( y != null){
                sum += y.val;
                y = y.next;
            }
            c.next= new ListNode(sum%10);
            tempsum = sum/10;
            c = c.next;
        }
        if(tempsum > 0){
            c.next = new ListNode(tempsum);
        }
        return relust.next;
    }
}
