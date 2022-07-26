package one;

import java.util.*;

public class BinaryTreeInorderTraversal
{

    public static void main(String[] args)
    {

    }

    public List<Integer> inorderTraversal(TreeNode root){
        List<Integer> result = new ArrayList<>();
        if(root.left != null){
            result.add(root.left.val);
            inorderTraversal(root.left);
        }
        result.add(root.val);
        if(root.right != null){
            result.add(root.right.val);
            inorderTraversal(root.right);
        }

        return result;
    }

}

class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(){}
    TreeNode(int val){
        this.val = val;
    }
    TreeNode(int val, TreeNode left, TreeNode right){
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
