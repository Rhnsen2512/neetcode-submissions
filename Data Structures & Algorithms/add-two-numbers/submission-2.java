/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }1
 */

class Solution {
    public ListNode addTwoNumbers(ListNode l11, ListNode l22) {
     
        ListNode dummyNode=new ListNode(-1);
        ListNode curr=dummyNode;
        int sum=0;
        int carry=0;
        while(l11!=null || l22!=null){
            sum=carry;
            if(l11!=null) sum+=l11.val;;
            if(l22!=null) sum+=l22.val;
            ListNode newNode= new ListNode(sum%10);
            
            carry=sum/10;
            curr.next=newNode;
            curr=newNode;
            if(l11!=null) l11=l11.next;
            if(l22!=null) l22=l22.next;

        }
        if(carry!=0){
            ListNode newNode = new ListNode(carry);
            curr.next=newNode;
            curr=newNode;
        }
        return dummyNode.next;
    }
    // public ListNode reverse(ListNode head){
    //     ListNode curr=head;
    //     ListNode prev=null;;
       
    //     while(curr!=null){
    //        ListNode next=curr.next;
    //        curr.next=prev;
    //        prev=curr;
    //        curr=next;


    //     }
    //     return prev;
    // }
}
