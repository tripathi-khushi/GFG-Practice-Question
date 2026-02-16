public class intersection_In_Y_Shaped_List {
    
    public Node intersectPoint(Node head1, Node head2) {
        // code here
               HashSet<Node> set = new HashSet<>();
               Node curr1 = head1;
               while(curr1!=null){
                   set.add(curr1);
                   curr1 = curr1.next;
               }
               
               Node curr2 = head2;
               while(curr2!=null){
                   if(set.contains(curr2)){
                       return curr2;
                   }
                   
                   curr2 = curr2.next;
               }
               
               return null;
    }

}
