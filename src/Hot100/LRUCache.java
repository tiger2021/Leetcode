package Hot100;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description:
 * @Author С�������
 * @create 2023/3/12 12:34
 */
public class LRUCache {
    private Map<Integer, DLNode> cache = new HashMap<Integer, DLNode>();
    private int size;    //cache�д洢�˼�������
    private int capacity;   //cache���������洢���ݵ�����
    private DLNode head, tail;  //˫�������ͷָ���βָ��



    public LRUCache(int capacity) {
        head=new DLNode();
        tail=new DLNode();
        head.next=tail;
        tail.pre=head;
        size=0;
        this.capacity=capacity;
    }

    public int get(int key) {
        DLNode dlNode = cache.get(key);
        if(dlNode==null){
            return -1;
        }else{
            moveToHead(dlNode);
            return dlNode.val;
        }

    }

    public void put(int key, int value) {
        DLNode dlNode = cache.get(key);
        if(dlNode==null){
            DLNode node = new DLNode(key, value);
            cache.put(key,node);
            addToHead(node);
            ++size;
            if(size>capacity){
                cache.remove(tail.pre.key);
                removeNode(tail.pre);
            }
        }else{
            dlNode.val=value;
            moveToHead(dlNode);
        }
    }

    public void removeNode(DLNode node){
        node.pre.next=node.next;
        node.next.pre=node.pre;
        node.pre=null;
        node.next=null;
    }

    public void addToHead(DLNode node){
        head.next.pre=node;
        node.next=head.next;
        head.next=node;
        node.pre=head;
    }

    public void moveToHead(DLNode node){
        removeNode(node);
        addToHead(node);
    }
}
