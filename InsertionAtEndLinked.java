public class InsertionAtEndLinked {
    
class Node{
    int data;
    Node next;

    Node(int x){
        data = x;
        next = null;
    }
}


    public Node insertAtEnd(Node head, int x) {
        // code here
        Node newNode = new Node(x);
        if(head==null){
            head = newNode;
            return newNode;
        }
        
        Node temp = head;
        while(temp.next!=null){
            temp = temp.next;
        }
        
        temp.next = newNode;
        return head;
    }

}
