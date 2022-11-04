package one;

import java.util.Arrays;

public class MissingNumber {

    public static void main(String[] args) {
        new MissingNumber().missingNumber(new int[]{3, 0, 1});
    }

    public int missingNumber(int[] nums){
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++){
            if (nums[i] != i){
                return nums[i] - 1;
            }
        }
        return nums[nums.length - 1] + 1;
    }
}
