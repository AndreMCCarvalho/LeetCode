package one;

public class PathSum
{

    public static void main(String[] args)
    {

    }

    public boolean hasPathSum(TreeNode root, int targetSum){
        if (root == null) return false;

        if(targetSum - root.val == 0 && root.left == null && root.right == null){
            return true;
        }
        
        int updatedSum = targetSum - root.val;

        return hasPathSum(root.left, updatedSum) || hasPathSum(root.right, updatedSum);
    }

}
