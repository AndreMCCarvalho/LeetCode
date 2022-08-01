package one;

public class MaximumDepthOfBinaryTree
{

    public static void main(String[] args)
    {

    }

    public int maxDepth(TreeNode root){
        if (root == null) return 0;
        int i = 1;
        int j = 1;

        if(root.left != null){
            i += maxDepth(root.left);
        }

        if(root.right != null){
            j += maxDepth(root.right);
        }

        return i > j ? i : j;
    }

}
