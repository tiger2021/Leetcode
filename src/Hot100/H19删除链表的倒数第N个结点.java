package Hot100;

/**
 * @ClassName H19ɾ������ĵ�����N�����
 * @Author С�������
 * @Function:
 */
public class H19ɾ������ĵ�����N����� {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head.next==null && n==1){
            head=null;
        }else{
            ListNode left=head;
            ListNode right=head;
            for (int i = 0; i < n; i++) {
                right=right.next;
            }
            if(right==null){   //��Ҫɾ��headָ���Ԫ��
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
