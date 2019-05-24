public class Solution {
    public ListNode ReverseList(ListNode head) {
        if(head == null) return null;
        ListNode pre = null;
        ListNode nextNode = null;
        while(head != null ){
            nextNode = head.next;
            head.next = pre;
            pre = head;
            head = nextNode;

        }
        return pre;
    }
}
