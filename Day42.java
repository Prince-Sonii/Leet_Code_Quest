/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
*/
public class Day42 {
    //Qno. 142 Linked List Cycle II
    //Solution
    /*
    public ListNode detectCycle(ListNode head) {
        ListNode fast=head;
        ListNode slow = head;
        int length =0;
        while(fast!=null && fast.next!=null) {
            fast = fast.next.next;
            slow = slow.next;
            if(slow==fast) {
                do{
                    slow = slow.next;
                    length++;
                } while(slow!=fast);
                break;
            }
        }
        if(length==0) {
            return null;
        }
        ListNode first = head;
        ListNode second = head;
        while(length>0) {
            first = first.next;
            length--;
        }
        while(first!=second) {
            first = first.next;
            second = second.next;
        }
        return second;
    }
    
     */
}
