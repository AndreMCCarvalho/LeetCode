package one;

public class InvertBinaryTree {

    public static void main(String[] args) {

    }

    public TreeNode invertTree(TreeNode root){
        if (root == null) return null;

        TreeNode right = root.right;

        root.right = root.left;
        root.left = right;

        invertTree(root.left);
        invertTree(root.right);

        return root;
    }

}
