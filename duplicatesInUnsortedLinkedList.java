import java.util.*;
public class duplicatesInUnsortedLinkedList {
    
    public Node removeDuplicates(Node head) {
        // Your code here
        HashSet<Integer> set = new HashSet<>();
        Node current = head;
        Node prev = null;
        while(current!=null){
            if(set.contains(current.data)){
                prev.next = current.next;
            }
            
            else{
                set.add(current.data);
                prev = current;
            }
            
            current = current.next;
        }
        
        
        return head;
        
        
    }

}
