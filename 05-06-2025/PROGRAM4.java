class Main {
    public static void main(String[] args) {
        //program for finding the height of tree
        Tree t = new Tree(new int[] {1,2,8,9,-1,-1,10,-1,-1,4,-1,5,-1,6,-1,7,-1,-1,3,11,-1,12,13,-1,14,-1,-1,-1,-1});
        Node root = t.getRoot();
        int heightOfRoot = Tree.heightOf(root);
        System.out.println("Height of tree is:" + heightOfRoot); 
    }
}
class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        this.left = null;
        this.right = null;
    }
}
class Tree{
    Node root;
    int index = -1;
    Tree(int[] nodes){
        this.root = buildTreeUsingArray(nodes);
        System.out.println(index);
    }
    public Node buildTreeUsingArray(int[] nodes){
        index++;
        if(index >= nodes.length){
            return null;
        }
        if(nodes[index] == -1)
        return null;
        Node newNode = new Node(nodes[index]);
         newNode.left = buildTreeUsingArray(nodes);
         newNode.right = buildTreeUsingArray(nodes);
         return newNode;
    }
    Node getRoot(){
    return root;
    }
    public static int heightOf(Node root){
        if(root == null)
        return 0;
        int lh = heightOf(root.left);
        int rh = heightOf(root.right);
        return Math.max(lh,rh) + 1;
    }
}
    