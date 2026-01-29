import java.util.*;
class Node {
    int data;
    Node next;
    Node(int x) {
        data = x;
        next = null;
    }
}
public class traversalInlinkedList {
    




    public ArrayList<Integer> printList(Node head) {
        ArrayList<Integer> list = new ArrayList<>();
        // code here
        Node current = head;
       while(current!=null){
           
           list.add(current.data);
           
           current = current.next;
       }
       
       return list;
        
    }
}

