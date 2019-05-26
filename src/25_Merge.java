public class Solution {
    public ListNode Merge(ListNode list1,ListNode list2) {
        if ( list1 == null ) return list2;
        if(list2 == null ) return list1;
        ListNode p = new ListNode(-1);
        ListNode ans =new ListNode(-1);
        if(list1.val <= list2.val) {
            ans = list1;
            list1 =list1.next;
        }
        else  {
            ans = list2;
            list2 =list2.next;
        }
        p.next =ans;
        while(list1 != null && list2 != null){
            if (list1.val <=  list2.val){
                ans.next = list1;
                list1  =list1.next;
            }
            else {
                ans.next =list2;
                list2 = list2.next;
            }
            ans = ans.next;
        }
        if(list1 ==null) ans.next = list2;
        else if (list2 ==null ) ans.next =list1;
        return p.next;
    }
}
