public class App {
    public static void main(String[] args) throws Exception {
        BinaryTree test = new BinaryTree();
        test.addNode(7, "here");
        test.addNode(8, "david");
        test.addNode(6, "keira");
        test.inOrderTraverseTree(test.root);

        Node output = test.LCA(test.root, 8, 6);
        System.out.println(output);
    }
}
