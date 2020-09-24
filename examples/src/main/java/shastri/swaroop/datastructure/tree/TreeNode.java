package shastri.swaroop.datastructure.tree;
//https://www.youtube.com/watch?v=oSWTXtMglKE
public class TreeNode {
    int data;
    TreeNode left, right;

    public TreeNode(int data){
        this.data = data;
    }

    public void insert(int value){
        if(value<=data){
            if(left == null){
                left = new TreeNode(value);
            } else {
                left.insert(value);
            }
        } else
            if(right == null){
                right = new TreeNode(value);
            } else {
                right.insert(value);
            }
    }

    public boolean contains(int value){
        if(value == data){
            return true;
        } else if(value<=data){
            if(left == null) {
                return false;
            } else {
                return left.contains(value);
            }
        } else {
            if(right == null){
                return false;
            } else {
                return right.contains(value);
            }
        }

    }

    public void printInOrder(){
        if(left!=null){
            left.printInOrder();
        }
        System.out.println(data);
        if(right!= null){
            right.printInOrder();
        }

    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(10);
        root.insert(5);
        root.insert(8);
        root.insert(15);
        //root.insert(8);

        root.printInOrder();
        System.out.println(root.contains(8));
        System.out.println(root.contains(9));
    }
}
