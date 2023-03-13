package Hot100;

import java.util.List;

/**
 * @Description:使用快慢指针找出中间点，左右递归，进行合并
 * @Author 小镇做题家
 * @create 2023/3/13 9:10
 */
public class H148排序链表 {
    public ListNode sortList(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }
        ListNode fast=head.next;
        ListNode slow=head;
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        ListNode right=sortList(slow.next);
        slow.next=null;  //这一步很关键，要不然会产生死循环
        ListNode left=sortList(head);


        ListNode res=new ListNode();
        ListNode r=res;
        while(left!=null && right!=null){
            if(left.val<right.val){
                r.next=left;
                left=left.next;
            }else{
                r.next=right;
                right=right.next;
            }
            r=r.next;
        }
        r.next=left!=null?left:right;
        return res.next;
    }
}
