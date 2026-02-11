/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public void reorderList(ListNode head) {
       ListNode slow = head;
       ListNode fast = head;
       while(fast!= null && fast.next!=null){
        slow = slow.next;
        fast = fast.next.next;       
    }
    ListNode temp = slow.next;
    ListNode prev = null;
    ListNode next = null;
    while(temp!=null){
        next = temp.next;
        temp.next = prev;
        prev = temp;
        temp=next;
    }
    slow.next = null;
    ListNode temp1 = head;
    ListNode temp2 =prev;
    while(temp2!=null){
         ListNode n1 = temp1.next;
          ListNode n2 = temp2.next;
        temp1.next = temp2 ;
        temp2.next = n1;
        temp1 = n1;
        temp2 = n2;
    }
    return;
}
}