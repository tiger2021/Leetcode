package Hot100;

import java.util.List;

/**
 * @Description:
 * @Author 小镇做题家
 * @create 2023/3/13 11:00
 */
public class H160相交链表 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int length=0;
        int flag=0;
        ListNode A=headA;
        ListNode B=headB;
        while(A!=null && B!=null){
            A=A.next;
            B=B.next;
        }
        if(A!=null){
            flag=1;
            while(A!=null){
                ++length;
                A=A.next;
            }
        }else{
            flag=2;
            while (B!=null){
                ++length;
                B=B.next;
            }
        }
        A=headA;
        B=headB;
        if(flag==1){
            while(length>0){
                A=A.next;
                --length;
            }
        }else{
            while(length>0){
                B=B.next;
                --length;
            }
        }
        while(A!=null){
            if(A==B){
                return A;
            }else{
                A=A.next;
                B=B.next;
            }
        }
        return null;
    }
}
