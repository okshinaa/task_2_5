package ru.vsu.cs.okshina_v_a;

public class Main {

    public static void main(String[] args) {
        MySimpleBinaryTree tree = new MySimpleBinaryTree();

        tree.root = new TreeNode(2);

        tree.root.left = new TreeNode(7);
        tree.root.right = new TreeNode(5);
        tree.root.left.right = new TreeNode(6);
        tree.root.left.right.left = new TreeNode(1);
        tree.root.left.right.right = new TreeNode(11);
        tree.root.right.right = new TreeNode(9);
        tree.root.right.right.left = new TreeNode(4);

        System.out.println("Maximum element is " + MySimpleBinaryTree.findMax(tree.root));
    }
}