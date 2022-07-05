package one;

public class RemoveDuplicatesFromSortedArray
{

    public static void main(String[] args)
    {

    }

    public int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        if (nums.length == 1) return 1;
        int   k    = 0;
        int[] temp = new int[nums.length];
        int   j    = 0;
        int lastSeenNumber = nums[0];
        temp[j++] = nums[0];

        for (int num : nums)
        {
            if (num > lastSeenNumber)
            {
                temp[j++] = num;
                lastSeenNumber = num;
            }
        }

        for(int i = 0; i < nums.length; i++){
            if(i < nums.length){
                nums[i] = temp[i];
            }
            else{
                nums[i] = -101;
            }
        }

        return j;
    }

    public int removeDuplicates2(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        if (nums.length == 1) return 1;
        int i = 0;
        for(int number : nums){
            if(i == 0 || number > nums[i-1]){
                nums[i++] = number;
            }
        }
        return i;
    }
}

