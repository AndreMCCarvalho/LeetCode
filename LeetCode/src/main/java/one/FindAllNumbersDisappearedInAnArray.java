package main.java.one;

import java.util.*;

public class FindAllNumbersDisappearedInAnArray {

    public static void main(String[] args) {
        new FindAllNumbersDisappearedInAnArray().findDisappearedNumbers(new int[]{4,3,2,7,8,2,3,1});
    }

    public List<Integer> findDisappearedNumbers(int[] nums){
        if (nums.length == 0) return new ArrayList<>();
        if (nums.length == 1) return List.of(nums[0]);

        Set<Integer> numbers = new HashSet<>();

        for (int i : nums){
            numbers.add(i);
        }

        List<Integer> missingValues = new ArrayList<>();

        for (int i = 0; i < nums.length; i++){
            if (!numbers.contains(i + 1)) missingValues.add(i + 1);
        }

        return missingValues;
    }

}
