public class linkedListCycle2 {
    
    public ListNode detectCycle(ListNode head) {
        if(head==null || head.next==null){
            return null;
        }
        ListNode Slow = head;
        ListNode Fast = head;
        while(Fast!=null && Fast.next!=null){
            Slow = Slow.next;
            Fast = Fast.next.next;

            if(Slow==Fast){
                ListNode entry = head;
                while(entry!=Slow){
                    entry = entry.next;
                    Slow = Slow.next;
                }

                return entry;
            }
        }

        return null;
    }

}
