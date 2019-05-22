//题目：给定单向链表的头指针和一个节点指针，定义一个函数在O(1)时间删除该节点。

//单向链表，通过遍历链表找到该节点的上一节点和下一节点，时间复杂度是查找链表的时间复杂度即O(n)。

/*要在在O(1)时间完成，可以根据给定的要删除的节点直接找到其后的节点，
把后面的节点的内容复制到当前节点处，同时将当前节点指向其后面节点的后面节点保证链表不断开，再把下一节点删掉就相当于把给定的节点删除了。
注意，如果要删除的节点是链表的尾节点的话，那还是需要从头结点按照顺序遍历到尾节点的前一节点，然后删除尾节点，
总的平均时间复杂度就是[(n-1)*1+O(n)]/n,结果还是O(1)。
*/

/* public class No13DeleteNodeInList {

     public static class ListNode{
         public int data;
         public ListNode next;
         public ListNode(int data,ListNode next){
             this.data=data;
             this.next=next;
         }
     }
*/ 

  public class Solutions{
     public static void deleteNode(ListNode head,ListNode node){
         //删除尾节点，采用顺序查找找到尾节点的前一节点
        if(node.next==null){
             while(head.next!=node){
                 head=head.next;
             }
             head.next=null;
         }
         //要删除的节点是头结点
         else if(head==node){
             head=null;
         }
         //要删除的节点是中间普通节点
         else{
             node.data=node.next.data;
             node.next=node.next.next;
         }
     }
 }
