package ru.vsu.cs.okshina_v_a;

class MySimpleBinaryTree {
    TreeNode root;

    public static int findMax(TreeNode node) {
        if (node == null) {
            return Integer.MIN_VALUE;
        }

        int res = node.data;
        int lres = findMax(node.left);
        int rres = findMax(node.right);

        if (lres > res) {
            res = lres;
        }
        if (rres > res) {
            res = rres;
        }

        return res;
    }
}