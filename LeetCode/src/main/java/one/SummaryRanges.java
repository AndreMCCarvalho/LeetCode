package one;

import java.util.*;

public class SummaryRanges {

    public static void main(String[] args) {
        new SummaryRanges().summaryRanges(new int[]{0,1,2,4,5,7});
    }

    public List<String> summaryRanges(int[] nums){
        if (nums == null || nums.length == 0) return new ArrayList<>();

        List<String> ranges = new ArrayList<>();

        Integer initialRange = null;

        for (int i = 0; i < nums.length - 1; i++){
            if(nums[i] + 1 == nums[i + 1]){
                if (initialRange == null) initialRange = nums[i];
            }
            else {
                if (initialRange != null)
                {
                    ranges.add(initialRange + "->" + nums[i]);
                    initialRange = null;
                }
                else{
                    ranges.add(String.valueOf(nums[i]));
                }
            }
        }

        if (initialRange != null){
            ranges.add(initialRange + "->" + nums[nums.length - 1]);
        }
        else{
            ranges.add(String.valueOf(nums[nums.length - 1]));
        }

        return ranges;
    }

}
