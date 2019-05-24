//输入一个链表，输出该链表中倒数第k个结点。

public class Solution {
    public ListNode FindKthToTail(ListNode head,int k) {
        if(head  == null || k<=0) return null;
        int p1 = 1;
        int p2 = 1;
        ListNode tail = head;
        //p2先走k-1步
        while(p1<k){
            if(tail.next ==null) return null;
            tail = tail.next;
            p1++;
        }
        while(tail.next!=null){
            head = head.next;
            tail = tail.next;
        }
        return head;
    }
}
