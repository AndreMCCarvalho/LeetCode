package main.java.one;

public class MoveZeroes {

    public static void main(String[] args) {

    }

    public void moveZeroes(int[] nums){
        if (nums.length <= 1) return;

        int lastNonZero = 0;

        for (int i = 0; i < nums.length; i++){
            if(nums[i] != 0){
                nums[lastNonZero] = nums[i];
                lastNonZero++;
            }
        }

        for (;lastNonZero < nums.length; lastNonZero++){
            nums[lastNonZero] = 0;
        }
    }

}
