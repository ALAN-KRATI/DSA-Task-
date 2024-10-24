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
    public ListNode middleNode(ListNode head) {
        int size = 0;
        ListNode head1 = head;

        while(head1 != null){
            size++;
            head1 = head1.next;
        }

        head1 = head;

        int mid  = size/2;

        for(int i = 1 ; i <= mid ; i++){
            head1 = head1.next;
        }

        return head1;
    }
}