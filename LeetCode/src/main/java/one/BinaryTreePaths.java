package one;

import java.util.*;

public class BinaryTreePaths {

    public static void main(String[] args) {

    }

    public List<String> binaryTreePaths(TreeNode root){
        if(root == null) return null;
        if(root.left == null && root.right == null) return List.of(String.valueOf(root.val));
        List<String> paths = new ArrayList<>();
        String path = "";
        path += root.val;
        if (root.left != null) traverseTree(root.left, path, paths);
        if (root.right != null) traverseTree(root.right, path, paths);

        return paths;
    }

    private void traverseTree(TreeNode root, String currentString, List<String> paths){
        currentString += "->" + root.val;
        if (root.left != null && root.right != null){
            traverseTree(root.left, currentString, paths);
            traverseTree(root.right, currentString, paths);
        }
        else if (root.left != null) traverseTree(root.left, currentString, paths);
        else if (root.right != null) traverseTree(root.right, currentString, paths);
        else paths.add(currentString);
    }

}
