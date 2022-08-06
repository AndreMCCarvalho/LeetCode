package one;

public class ConvertSortedArrayToBinarySearch {

    public static void main(String[] args) {

    }

    public TreeNode sortedArrayToBST(int[] nums){
        if(nums == null || nums.length == 0) return null;

        TreeNode start = buildTree(nums, 0, nums.length - 1);

        return start;
    }

    private TreeNode buildTree(int[] nums, int low, int high){
        if (low > high){
            return null;
        }

        int mid = (low + high) / 2;
        TreeNode node = new TreeNode(nums[mid]);
        node.left = buildTree(nums, low, mid - 1);
        node.right = buildTree(nums, mid + 1, high);

        return node;
    }

}


// [-15, -10, -3, 0 , 5, 9, 10]
