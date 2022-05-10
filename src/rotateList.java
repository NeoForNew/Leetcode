
class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null || k==0)
            return head;
        ListNode cur = head;
        ListNode tail = null;
        //calculate the total length of n
        int len = 0;
        for(cur = head; cur != null ; cur = cur.next){
            tail = cur;
            len++;
        }// notice how to calculate the length of a list
        //find the length needs to be moved
        k = k % len;
        cur = head;
        for(int i=0;i< len-k-1;i++)
            cur = cur.next;
        tail.next = head;
        head = cur.next;
        cur.next = null;
        return head;
    }
}
