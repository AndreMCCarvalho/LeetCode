package one;

public class BalancedBinaryTree
{

    public static void main(String[] args) {

    }

    public boolean isBalanced(TreeNode root) {
        if (root == null) return true;

        return discoverTreeDepth(root) != -1;
    }

    private int discoverTreeDepth(TreeNode node){
        if(node == null){
            return 0;
        }
        int lh = discoverTreeDepth(node.left);
        if(lh == -1){
            return -1;
        }
        int rh = discoverTreeDepth(node.right);
        if(rh == -1){
            return -1;
        }
        if(lh - rh < -1 || lh - rh > 1){
            return -1;
        }
        return Math.max(lh, rh) + 1;
    }

}
