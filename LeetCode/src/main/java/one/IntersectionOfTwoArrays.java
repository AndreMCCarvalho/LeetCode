package one;

import java.util.*;

public class IntersectionOfTwoArrays {

    public static void main(String[] args)
    {
        new IntersectionOfTwoArrays().intersection(new int[]{4,9,5}, new int[]{9,4,9,8,4});
    }

    public int[] intersection(int[] nums1, int[] nums2){
        List<Integer> intersect = new ArrayList<>();

        for (int i = 0; i < nums1.length; i++){
            int j = 0;
            while (j < nums2.length)
            {
                if (nums1[i] == nums2[j] && !intersect.contains(nums1[i]))
                {
                    intersect.add(nums1[i]);
                    break;
                }
                j++;
            }
        }
        return intersect.stream().mapToInt(Integer::intValue).toArray();
    }

}
