public class merge_of_two_linkedlist {
      public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode newNode = new ListNode(0);
        ListNode curr = newNode;
        ListNode head1 = list1;
        ListNode head2 = list2;
        while(head1!=null && head2!=null){
            if(head1.val<=head2.val){
                curr.next = head1;
                head1 = head1.next;
            }
            else{
                curr.next = head2;
                head2 = head2.next;
            }

            curr = curr.next;
        }

        if(head1!=null){
            curr.next = head1;
        }
        else{
            curr.next = head2;
        }

        return newNode.next;
        
    }
}
