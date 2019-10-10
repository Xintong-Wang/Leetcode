/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode swapPairs(ListNode head) {
        ListNode nex = null;
        ListNode start = new ListNode(0);
        start.next = head;
        ListNode pre = start;
        while(pre.next != null && pre.next.next != null){
            nex = pre.next.next;
            pre.next.next = nex.next;
            nex.next = pre.next;
            pre.next = nex;
            pre = nex.next;
        }
        return start.next;
    }
}

