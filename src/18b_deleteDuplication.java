public class Solution {
    public ListNode deleteDuplication(ListNode pHead){
        if(pHead == null || pHead.next ==null) return pHead;

        ListNode pre = new ListNode(-1) ;
        pre.next  =pHead;
        ListNode ans =pre;
        while (pHead != null &&pHead.next!=null){
            if(pHead.next.val ==pHead.val){
                int val =pHead.val;
                while(pHead.next!=null && pHead.next.val ==val){
                    pHead.next = pHead.next.next;
                }
                pre.next = pHead.next;
                pHead =pre.next;
            }
            else {
                pHead =pHead.next;
                pre =pre.next;
            }
            
        }
        return ans.next;
    }
}
