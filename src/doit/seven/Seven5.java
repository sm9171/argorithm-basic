package doit.seven;


class Node {
    int data;
    Node lt, rt;

    public Node(int val) {
        data = val;
        lt = rt = null;
    }
}

public class Seven5 {
    Node root;

    public void DFS(Node root) {
        if (root == null) {
            return;
        }else{
            System.out.println(root.data); //전위
            DFS(root.lt);
            //중위
            DFS(root.rt);
            //후위
        }
    }
    public static void main(String[] args) {
        Seven5 tree = new Seven5();
        tree.root = new Node(1);
        tree.root.lt = new Node(2);
        tree.root.rt = new Node(3);
        tree.root.lt.lt = new Node(4);
        tree.root.lt.rt = new Node(5);
        tree.root.rt.lt = new Node(6);
        tree.root.rt.rt = new Node(7);
        tree.DFS(tree.root);
    }
}
