import java.util.*;
package BST;

public class Insertion {
      public Node insert(Node root, int key) {
        // code here
        if(root==null){
            return new Node(key);
        }
        
        if(key<root.data){
            root.left = insert(root.left,key);
        }
        else{
            root.right = insert(root.right,key);
        }
        
        return root;
    }
}
