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

class Day46 {
    //Qno. 876 Middle of the Linked List
 //solution
    /*
    public ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
       while(fast!=null && fast.next!=null) {
            slow = slow.next;
            fast = fast.next.next;
        } 
        return slow;

        // int count=0;
        // ListNode temp = head;
        // while(temp!=null) {
        //     temp = temp.next;
        //     count++;
        // }
        // // count = count%2==0?(count/2)+1:count/2;
        // for(int i=0;i<count/2;i++) {
        //     head = head.next;
        // }
        // return head;
    }*/
}
