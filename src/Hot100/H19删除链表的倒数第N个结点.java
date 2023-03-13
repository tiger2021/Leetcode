package Hot100;

/**
 * @ClassName H19删除链表的倒数第N个结点
 * @Author 小镇做题家
 * @Function:
 */
public class H19删除链表的倒数第N个结点 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head.next==null && n==1){
            head=null;
        }else{
            ListNode left=head;
            ListNode right=head;
            for (int i = 0; i < n; i++) {
                right=right.next;
            }
            if(right==null){   //需要删除head指向的元素
                head=head.next;
            }else{
                while(right.next!=null){
                    left=left.next;
                    right=right.next;
                }
                left.next=left.next.next;
            }
        }
        return head;

    }
}
