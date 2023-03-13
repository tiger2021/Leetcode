package Hot100;

/**
 * @Description:    f=s+nb=2s  ===> s=nb
 *                  k=a+nb 刚好到达环的入口处  ==>a+nb=a+s ==>快指针和慢指针相遇后，
 *                                                         慢指针再走a步就可到达环的入口处
 *                  f：快指针走的步数
 *                  s:慢指针走的步数
 *                  a:环之前的节点数
 *                  b:环的节点数量
 * @Author 小镇做题家
 * @create 2023/3/12 10:41
 */
public class H142环形链表2 {
    public ListNode detectCycle(ListNode head) {
        if(head==null || head.next==null){
            return null;
        }
        ListNode fast=head.next.next;
        ListNode slow=head.next;
        while(fast!=null && fast.next!=null && fast!=slow){
            fast=fast.next.next;
            slow=slow.next;
        }
        if(fast==null || fast.next==null){
            return null;
        }
        fast=head;
        while(fast!=slow){
            fast=fast.next;
            slow=slow.next;
        }
        return fast;


    }
}
