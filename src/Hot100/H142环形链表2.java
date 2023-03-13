package Hot100;

/**
 * @Description:    f=s+nb=2s  ===> s=nb
 *                  k=a+nb �պõ��ﻷ����ڴ�  ==>a+nb=a+s ==>��ָ�����ָ��������
 *                                                         ��ָ������a���Ϳɵ��ﻷ����ڴ�
 *                  f����ָ���ߵĲ���
 *                  s:��ָ���ߵĲ���
 *                  a:��֮ǰ�Ľڵ���
 *                  b:���Ľڵ�����
 * @Author С�������
 * @create 2023/3/12 10:41
 */
public class H142��������2 {
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
