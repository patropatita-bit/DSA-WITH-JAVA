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
        ListNode s=head;
        ListNode f=head;

        while (f !=null && f.next!=null){
            s=s.next;
            f=f.next.next;

        }
        ListNode prev=null;
     ListNode curr= s ;

        while (curr !=null){
            ListNode next=curr.next;

            curr.next=prev;

            prev=curr;
            curr=next;
                    
        }

ListNode fst=head;
ListNode scond=prev;
                 
while(scond != null){
    if(fst.val != scond.val){
        return false;

    }
   fst= fst.next;
   scond= scond.next;
}
return true;
    }
}