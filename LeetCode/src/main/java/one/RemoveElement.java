package one;

public class RemoveElement
{

    public static void main(String[] args)
    {

    }

    public int removeElement(int[] nums, int val) {
        if(nums == null || nums.length == 0 || (nums.length == 1 && nums[0] == val)) return 0;
        if(nums.length < 2) return 1;
        int k = 0;

        for(int n : nums){
            if(n != val){
                nums[k++] = n;
            }
        }

        return k;
    }
}
