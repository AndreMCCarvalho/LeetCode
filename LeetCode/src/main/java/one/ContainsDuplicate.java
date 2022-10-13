package main.java.one;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {

    public static void main(String[] args) {
        new ContainsDuplicate().containsDuplicate(new int[]{1,2,3,1});
    }

    public boolean containsDuplicate(int[] nums){
        if (nums == null || nums.length == 1) return false;
        Arrays.sort(nums);
        for(int i = 1; i < nums.length; i++){
            if(nums[i] == nums[i-1]) return true;
        }

        return false;
    }

    public boolean containsDuplicate2(int[] nums){
        Set<Integer> distinct = new HashSet<Integer>();

        for(int i : nums){
            if(distinct.contains(i)) return true;
            distinct.add(i);
        }

        return false;
    }

}
