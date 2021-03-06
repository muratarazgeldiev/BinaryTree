public class Tree<T extends Number>{
    Node root;
    class Node {
        Node left;
        Node right;
        T value;

        Node(T value){
            this.value = value;
        }
    }
    public int insertHeight(Node node){
        return height(node);
    }
    public int insertFindMax(Node node){
    return findMax(node);
}
    public int insertFindMin(Node node){
        return findMin(node);
    }
    public boolean insertCheckNumber(Node node, int insertNumber){
        return checkNumber(node, insertNumber);
    }
    public void add(T value){
        insert(value, root);
    }
    private int findMax(Node node) {
        if(node == null){
            return Integer.parseInt(null);
        } else {
            if(node.right == null){
                return node.value.intValue();
            }
        }
        return findMax(node.right);
    }
    private int findMin(Node node) {
        if(node == null){
            return Integer.parseInt(null);
        } else {
            if(node.left == null){
                return node.value.intValue();
            }
        }
        return findMin(node.left);
    }
    private int height(Node node){
        if(node == null){
            return  0;
        }
        return 1 + Math.max(height(node.left),height(node.right));
    }
    private boolean checkNumber(Node node , int number){
            if(node == null){
                return false;
            } else {
                if(number == node.value.intValue()){
                return true;
            } else {
                if(number < node.value.intValue()){
                    return (checkNumber(node.left, number));
                } else {
                    return (checkNumber(node.right, number));
                }
            }
        }
    }
    private void insert(T value, Node node){
        if(root == null){
            root = new Node(value);
            System.out.println("Root is " + root.value);
            return;
        }
        if(node.value.doubleValue() > value.doubleValue()){
            if(node.left == null){
                node.left = new Node(value);
                System.out.println("Root is " + node.value + " left " + value);
            } else {
                insert(value, node.left);
            }
        } else {
            if(node.right == null){
                node.right = new Node(value);
                System.out.println("Root is " + node.value + " right " + value);
            } else {
                insert(value, node.right);
            }
        }

    }

}
