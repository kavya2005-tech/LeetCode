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
    public int pairSum(ListNode head) {
        /*ListNode slow = head;
        ListNode fast = head;
        ListNode next = null;
        if(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
  
        ListNode pre=null;
        ListNode next=null;
        while(slow.next!=0){
            next=temp.next;
            temp.next=pre;
            pre=temp;
            temp=next;
        }
        slow.next=pre; 
        ListNode sum;
        while()
        sum =head+slow.next;*/
        
        ListNode fast = head;
        ListNode slow = head;
        ListNode next = null;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
      //slow retuen mid
      ListNode prev = null;
      ListNode curr = slow;
      while (curr != null){
        ListNode nn = curr.next;
        curr.next = prev;
        prev = curr;
        curr = nn;
      }
      int max = 0;
      ListNode first = head;
      ListNode second = prev;
      while(second != null){
        max = Math.max(max,first.val + second.val);
        first = first.next;
        second = second.next;
      }
      return max;
    }
}