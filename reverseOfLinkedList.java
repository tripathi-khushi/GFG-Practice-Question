java.util.*;

 
 public class ListNode {
    int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
 
public class reverseOfLinkedList {
    
   
    
    public ListNode reverse(ListNode head){
        ListNode current = head;
        ListNode next = null;
        ListNode prev = null;
        while(current!=null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
            
        }

        return prev;
    }
    public boolean isPalindrome(ListNode head) {
        ListNode slowPtr = head;
        ListNode fastPtr = head;
        while(fastPtr!=null && fastPtr.next.next!=null){
            slowPtr = slowPtr.next;
            fastPtr = fastPtr.next.next;
        }
        ListNode secondHalfHead = reverse(slowPtr.next);
        ListNode firstHalfPtr = head;
        ListNode secondHalfPtr = secondHalfHead;
        boolean result = true;
        while(secondHalfPtr!=null){
            if(firstHalfPtr.val!=secondHalfPtr.val){
                result = false;
                break;
            }
            firstHalfPtr = firstHalfPtr.next;
            secondHalfPtr = secondHalfPtr.next;
        }

        return result;

        
    }

}
