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
    public boolean isPalindrome(ListNode head) {
        ListNode s = head;
        ListNode f = head;
        while(f != null && f.next != null){
            s = s.next;
            f = f.next.next;
        }
        ListNode t = s;
        ListNode p = null;
        ListNode next = null;
        while(t != null){
            next = t.next;
            t.next = p;
            p = t;
            t = next;
        }
        ListNode t1 = head;
        ListNode t2 = p;
        while(t2 != null){
            if(t1.val != t2.val){
                return false;
            }
            t1 = t1.next;
            t2 = t2.next;
        }
        return true;
    }
}