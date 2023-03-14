package Hot100;

/**
 * @ClassName H2两数相加
 * @Author 小镇做题家
 * @Function:
 */
public class H2两数相加 {

    // 定义成员内部类
    public class ListNode {
        int val;
        ListNode next;

        public ListNode() {
        }

        public ListNode(int val) {
            this.val = val;
        }

        public ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode l3 = new ListNode();
        ListNode r = l3;
        ListNode p1, p2;
        p1 = l1;
        p2 = l2;
        int go = 0;
        while (p1 != null && p2 != null) {
            ListNode temp = new ListNode();
            temp.val = (p1.val + p2.val + go) % 10;
            go = (p1.val + p2.val + go) / 10;
            p1 = p1.next;
            p2 = p2.next;
            r.next = temp;
            r = r.next;
        }
        while (p1 != null) {
            ListNode temp = new ListNode();
            temp.val = (p1.val + go) % 10;
            go = (p1.val + go) / 10;
            p1 = p1.next;
            r.next = temp;
            r = r.next;
        }
        while (p2 != null) {
            ListNode temp = new ListNode();
            temp.val = (p2.val + go) % 10;
            go = (p2.val + go) / 10;
            p2 = p2.next;
            r.next = temp;
            r = r.next;
        }
        if (go != 0) {
            ListNode temp = new ListNode();
            temp.val = go;
            r.next = temp;
            r = r.next;
        }
        r.next = null;
        l3 = l3.next;
        return l3;

    }
}
