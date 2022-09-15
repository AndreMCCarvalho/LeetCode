package one;

import java.util.*;

public class BinaryTreePreOrderTraversal {

    public static void main(String[] args)
    {

    }

    public List<Integer> preorderTraversal(TreeNode root){
        List<Integer> values = new ArrayList<>();

        traverseTree(root, values);

        return values;
    }

    private void traverseTree(TreeNode root, List<Integer> values){
        if (root == null) return;

        values.add(root.val);
        traverseTree(root.left, values);
        traverseTree(root.right, values);
    }

}
