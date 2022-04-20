package ru.vsu.cs.okshina_v_a;

public class ConstructionTestingTrees {
    public static TreeNode buildTreeOneForTest1() {
        MySimpleBinaryTree tree1 = new MySimpleBinaryTree();

        tree1.root = new TreeNode(5);

        tree1.root.left = new TreeNode(1);
        tree1.root.right = new TreeNode(2);
        tree1.root.left.right = new TreeNode(3);
        tree1.root.left.right.left = new TreeNode(4);
        tree1.root.left.right.right = new TreeNode(5);
        tree1.root.right.right = new TreeNode(6);
        tree1.root.right.right.left = new TreeNode(7);

        return tree1.root;
    }

    public static TreeNode buildTreeTwoForTest2() {
        MySimpleBinaryTree tree2 = new MySimpleBinaryTree();

        tree2.root = new TreeNode(20);

        tree2.root.left = new TreeNode(31);
        tree2.root.right = new TreeNode(42);
        tree2.root.left.right = new TreeNode(53);
        tree2.root.left.right.left = new TreeNode(44);
        tree2.root.left.right.right = new TreeNode(5);
        tree2.root.right.right = new TreeNode(16);

        return tree2.root;
    }

    public static TreeNode buildTreeThreeForTest3() {
        MySimpleBinaryTree tree3 = new MySimpleBinaryTree();

        tree3.root = new TreeNode(2);

        tree3.root.left = new TreeNode(2);
        tree3.root.right = new TreeNode(2);
        tree3.root.left.right = new TreeNode(2);
        tree3.root.left.right.left = new TreeNode(2);

        return tree3.root;
    }
}
