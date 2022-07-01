package one;

import java.util.*;

public class TwoSum
{
    public static void main(String[] args)
    {
        System.out.println(new int[4].length / 2);
    }

    public int[] twoSum(int[] nums, int target){
        HashMap<Integer, Integer> memory = new HashMap<>();
        for (int i = 0; i < nums.length; i++){
            int needNumber = target - nums[i];
            if (memory.containsKey(needNumber)){
                return new int[]{i, memory.get(needNumber)};
            }
            else{
                memory.put(nums[i], i);
            }
        }
        return new int[0];
    }
}
