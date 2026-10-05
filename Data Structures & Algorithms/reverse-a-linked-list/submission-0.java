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
    public ListNode reverseList(ListNode head) {
        ListNode root = head;
        ListNode prev = null;

        if(root == null || root.next ==null){
            return root;
        }
        while(root !=null){
            ListNode currNode = root.next;
            root.next= prev;
            prev=root;
            root=currNode;
        }
        head=prev;
        return head;
    }
}
