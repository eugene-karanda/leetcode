package org.overmind;

import java.util.ArrayDeque;
import java.util.Objects;
import java.util.Queue;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    /**
     * Builds a tree from its level order representation, as used on LeetCode: {@code [3, 9, 20, null, null, 15, 7]}.
     */
    static TreeNode of(Integer... values) {
        if (values.length == 0 || values[0] == null) {
            return null;
        }

        TreeNode root = new TreeNode(values[0]);
        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.add(root);

        for (int i = 1; i < values.length; i += 2) {
            TreeNode node = queue.poll();

            if (values[i] != null) {
                node.left = new TreeNode(values[i]);
                queue.add(node.left);
            }

            if (i + 1 < values.length && values[i + 1] != null) {
                node.right = new TreeNode(values[i + 1]);
                queue.add(node.right);
            }
        }

        return root;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TreeNode treeNode = (TreeNode) o;
        return val == treeNode.val
                && Objects.equals(left, treeNode.left)
                && Objects.equals(right, treeNode.right);
    }

    @Override
    public int hashCode() {
        return Objects.hash(val, left, right);
    }

    private void traversePreOrder(StringBuilder sb, String padding, String pointer, TreeNode node) {
        if (node != null) {
            sb.append(padding);
            sb.append(pointer);
            sb.append(node.val);
            sb.append("\n");

            String paddingForBoth = padding + "│  ";
            String pointerForRight = "└──";
            String pointerForLeft = (node.right != null) ? "├──" : "└──";

            traversePreOrder(sb, paddingForBoth, pointerForLeft, node.left);
            traversePreOrder(sb, paddingForBoth, pointerForRight, node.right);
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        traversePreOrder(sb, "", "", this);
        return sb.toString();
    }
}
