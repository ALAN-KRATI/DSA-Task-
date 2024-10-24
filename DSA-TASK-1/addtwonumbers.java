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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
     int carry = 0;
        int sum;

        ListNode p = new ListNode();
        ListNode head = p;



        while(l1 != null && l2 != null){
            
            sum = l1.val + l2.val + carry;
            carry = sum/10;
           ListNode l3 = new  ListNode(sum%10);
            p.next = l3;
            p = p.next;
            l1 = l1.next;
            l2 = l2.next;
        }

        while(l1 != null){
            sum = l1.val + carry;
            carry = sum/10;
           ListNode l3 = new  ListNode(sum%10);
            p.next = l3;
            p = p.next;
            l1 = l1.next;

        }
        while(l2 != null){
            sum = l2.val + carry;
            carry = sum/10;
           ListNode l3 = new  ListNode(sum%10);
            p.next = l3;
            p = p.next;
            l2 = l2.next;
        }
        while(carry != 0){
           ListNode l3 = new  ListNode(carry%10);
           carry = carry/10;
            p.next = l3;
            p = p.next;

        }


        
        return head.next;
    }
}