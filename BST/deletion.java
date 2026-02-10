package BST;

public class deletion {
    
    
    public static Node findMin(Node root){
        
        while(root!=null && root.left!=null ){
            
            root = root.left;
        }
        
        return root;
    }
    public Node delNode(Node root, int x) {
        // code here
       if(root==null){
           return root;
       } 
       
       if(x < root.data){
           root.left = delNode(root.left,x);
       }
       
       else if(x> root.data){
           root.right = delNode(root.right, x);
       }
       
       else{
           if(root.left==null){
               return root.right;
           }
           if(root.right==null){
               return root.left;
           }
           
           Node successor = findMin(root.right);
           root.data = successor.data;
           root.right = delNode(root.right, successor.data);
           
           
           
           
       }
       
       return root;
    }

}
