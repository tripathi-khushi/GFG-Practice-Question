public class IdenticalTree {
    /*
class Node{
    int data;
    Node left, right;
    Node(int d){
        data=d;
        left=right=null;
    }
}
*/


    public boolean isIdentical(Node r1, Node r2) {
        // code here
        if(r1==null && r2 == null){
            return true;
        }
        if(r1==null || r2==null){
            
            return false;
            
        }
        Queue<Node> q1 = new LinkedList<>();
        Queue<Node> q2 = new LinkedList<>();
        q1.add(r1);
        q2.add(r2);
        
        while (!q1.isEmpty() && !q2.isEmpty()) {
            Node node1 = q1.poll();
            Node node2 = q2.poll();
            
            if (node1.data != node2.data)
                return false;
                
            if(node1.left!=null && node2.left!=null){
                q1.add(node1.left);
                q2.add(node2.left);
            }
            else if(node1.left!=null || node2.left!=null){
                return false;
                
            }
            
            if(node1.right!=null && node2.right!=null){
                q1.add(node1.right);
                q2.add(node2.right);
            }
            else if(node1.right!=null || node2.right!=null){
                return false;
                
            }
        }
        
        return q1.isEmpty() && q2.isEmpty();

    }

}
