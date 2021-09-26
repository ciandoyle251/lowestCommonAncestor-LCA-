public class BinaryTree {

    Node root;

    public void addNode(int key, String name){
        Node newNode = new Node(key, name);

        if(root == null){
            root = newNode;
        }
        else{
            Node focusNode = root;
            Node parent;

            while(true){
                parent = focusNode;
                if(key < focusNode.key){
                    focusNode = focusNode.leftChild;
                    if(focusNode == null){
                        parent.leftChild = newNode;
                        return;
                    }
                }
                else{
                    focusNode = focusNode.rightChild;
                    if(focusNode == null){
                        parent.rightChild = newNode;
                        return;
                    }
                }
            }
        }
    }

    public void inOrderTraverseTree(Node focusNode){
        if(focusNode != null){
            inOrderTraverseTree(focusNode.leftChild);
            System.out.println(focusNode);
            inOrderTraverseTree(focusNode.rightChild);
        }

    }

    public Node LCA(Node root, int a, int b){
        if((a < root.key) &&(b < root.key)){
            return LCA(root.leftChild, a, b);
        }
        
        else if((a > root.key) &&(b > root.key)){
            return LCA(root.rightChild, a, b);
        }
        
        return root;
    }
    
}
class Node {
    int key;
    String name;

    Node leftChild;
    Node rightChild;

    Node(int key, String name){
        this.key = key;
        this.name = name;
    }

    public String toString(){
        return name + " " + key;
    }
}