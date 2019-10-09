/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */

// class Solution {
//     public ListNode insertionSortList(ListNode head) {
//         ListNode nextNode = null;
//         int tmp = 0;
//         ListNode curNode = head;
//         if(head == null || head.next == null)
//             return head;
//         while(curNode.next != null){
//             nextNode = curNode.next;
//             while(nextNode != null){
//                 if(curNode.val > nextNode.val){
//                     tmp = curNode.val;
//                     curNode.val = nextNode.val;
//                     nextNode.val = tmp;
//                 }
//                 nextNode = nextNode.next;
//             }
//             curNode = curNode.next;
//         }
//         return head;
//     }
// }

class Solution {
    public ListNode insertionSortList(ListNode head) {
        if(head == null || head.next == null)
            return head;
        ListNode start = new ListNode(0);
        ListNode curNode = start;
        while(head != null){
            ListNode nextNode = head.next;
            while(curNode.next != null && curNode.next.val <= head.val){
                curNode = curNode.next;
            }
            head.next = curNode.next;
            curNode.next = head;
            head = nextNode;
        }
        return start.next;
    }
}
