package Hot100;

/**
 * @ClassName H21�ϲ�������������
 * @Author С�������
 * @Function:
 */
public class H21�ϲ������������� {

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode head=new ListNode();
        ListNode l1=list1,l2=list2;
        ListNode r=head;
        while(l1!=null && l2!=null){
            if(l1.val<=l2.val){
                r.next=l1;
                r=r.next;
                l1=l1.next;
            }else{
                r.next=l2;
                r=r.next;
                l2=l2.next;
            }
        }
        if(l1!=null){
            r.next=l1;
        }else{
            r.next=l2;
        }
        head=head.next;


        return head;
    }
}
