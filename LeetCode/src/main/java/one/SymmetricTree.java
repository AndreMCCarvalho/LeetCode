package one;

import java.util.*;

public class SymmetricTree
{

    public static void main(String[] args)
    {

    }

    public boolean isSymmetric(TreeNode root){
        if(root == null) return true;
        Stack<Integer> values = new Stack<>();

        postOrderTraversal(root, values);
        customOrderTraversal(root, values);

        return values.isEmpty();
    }

    private void postOrderTraversal(TreeNode root, Stack<Integer> values){
        if(root == null) return;
        postOrderTraversal(root.left, values);
        postOrderTraversal(root.right, values);
        values.push(root.val);
    }

    private void customOrderTraversal(TreeNode root, Stack<Integer> values){
        if(root == null) return;
        customOrderTraversal(root.right, values);
        customOrderTraversal(root.left, values);
        if(values.peek() == root.val){
            values.pop();
        }
    }

}
