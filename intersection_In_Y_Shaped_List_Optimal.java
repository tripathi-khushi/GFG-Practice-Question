public class intersection_In_Y_Shaped_List_Optimal {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
  
        // code here
        ListNode ptr1 = headA;
        ListNode ptr2 = headB;
        if(ptr1==null || ptr2==null){
            return null;
        }
        
        while(ptr1!=ptr2){
            if(ptr1!=null){
                ptr1 = ptr1.next;
            }
            else{
                ptr1 = headA;
            }
            
            if(ptr2!=null){
                ptr2 = ptr2.next;
            }
            else{
                ptr2 = headB;
            }
            
        }
        
        return ptr1;
    }
        
}
