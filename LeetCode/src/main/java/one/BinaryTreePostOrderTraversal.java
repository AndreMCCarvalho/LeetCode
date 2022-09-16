package one;

import java.util.*;

public class BinaryTreePostOrderTraversal {

    public static void main(String[] args) {
        TreeNode one = new TreeNode(1);
        one.left = null;
        one.right = new TreeNode(2);
        one.right.left = new TreeNode(3);
    }

    public List<Integer> postorderTraversal(TreeNode root){
        List<Integer> values = new ArrayList<>();
        if (root == null) return values;
        Stack<TreeNode> traverse = new Stack<>();
        traverse.push(root);
        while(!traverse.isEmpty()){
            TreeNode curr = traverse.pop();
            if (curr.left != null) traverse.add(curr.left);
            if (curr.right != null) traverse.add(curr.right);
            values.add(0, curr.val);
        }
        return values;
    }

    public List<Integer> postorderTraversalRecur(TreeNode root){
        List<Integer> values = new ArrayList<>();
        if (root == null) return values;

        postTraverse(root.left, values);
        postTraverse(root.right, values);
        values.add(root.val);

        return values;
    }

    public void postTraverse(TreeNode root, List<Integer> values){
        if(root == null) return;
        postTraverse(root.left, values);
        postTraverse(root.right, values);
        values.add(root.val);
    }

}
