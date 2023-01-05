package one;

public class SumOfLeftLeaves {

    public int sumOfLeftLeaves(TreeNode root){
        if (root == null) return 0;
        int sum = 0;

        sum += transverseTree(root.left, true);
        sum += transverseTree(root.right, false);

        return sum;
    }

    private int transverseTree(TreeNode root, boolean addSum){
        if (root == null) return 0;
        int sum = addSum && (root.left == null && root.right == null) ? root.val : 0;
        sum += transverseTree(root.left, true);
        sum += transverseTree(root.right, false);
        return sum;
    }
}
