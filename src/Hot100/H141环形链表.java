package Hot100;

/**
 * @Description:
 * @Author 小镇做题家
 * @create 2023/3/12 10:17
 */

public class H141环形链表 {

    /**
     * @description:一个指针每次走两步，一个指针每次走一步
     * @param: [head]
     * @return: boolean
     **/
        public boolean hasCycle(ListNode head) {
            if(head==null || head.next==null){
                return false;
            }
            ListNode fast=head;
            ListNode slow=head;
            while(fast!=slow && fast.next!=null && fast.next.next!=null){
                slow=slow.next;
                fast=fast.next.next;
            }
            if(slow==fast){
                return true;
            }else{
                return false;
            }
    }
}
