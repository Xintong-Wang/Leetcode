/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        if(head == null || k == 1)
            return head;
        ListNode cur = head;
        for(int i = 0; i < k; i++){
            if(cur == null)
                return head;
            cur = cur.next;
        }
        ListNode reverse = reverse(head, cur);
        head.next = reverseKGroup(cur, k);
        return reverse;
    }
    public ListNode reverse(ListNode head, ListNode tail){
        ListNode start = tail;
        while(head != tail){
            ListNode nex = head.next;
            head.next = start;
            start = head;
            head = nex;
        }
        return start;
    }
}
