public class searchingInBst {
    
    public boolean search(Node root, int key) {
        // code here
        if(root==null){
            return false;
        }
        if(root.data==key){
            return true;
        }
        else if(root.data<key){
           return search(root.right,key);
        }
        else{
            return search(root.left,key);
        }
    }
}

