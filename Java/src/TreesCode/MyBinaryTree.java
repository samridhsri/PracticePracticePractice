package TreesCode;

class Node{
    int data;
    Node right;
    Node left;

    Node(int x){
        data = x;
        right = null;
        left = null;
    }


}
public class MyBinaryTree {
    Node root;
    MyBinaryTree(){
        root = null;
    }

    void inorder(Node root){
        // left root right

        if(root!=null){
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }

    }

    void preorder(Node root){
        if(root!=null){
            System.out.print(root.data + " ");
            preorder(root.left);
            preorder(root.right);
        }
    }

    void postorder(Node root){
        if(root!=null){
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data + " ");;
        }
    }
}

//Binary Tree that I am using: https://upload.wikimedia.org/wikipedia/commons/thumb/d/da/Binary_search_tree.svg/1200px-Binary_search_tree.svg.png

class Test{
    public static void main(String[] args) {
        MyBinaryTree tree = new MyBinaryTree();
        tree.root = new Node(8);
        tree.root.left = new Node(3);
        tree.root.left.left = new Node(1);
        tree.root.left.right = new Node(6);
        tree.root.left.right.left = new Node(4);
        tree.root.left.right.right = new Node(7);
        tree.root.right = new Node(10);
        tree.root.right.right = new Node(14);
        tree.root.right.right.left = new Node(13);

        tree.inorder(tree.root);
        System.out.println();
        tree.preorder(tree.root);
        System.out.println();
        tree.postorder(tree.root);
    }
}