package one;

import java.util.*;

public class IntersectionOfTwoArraysTwo {

    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        ArrayList<Integer> intersect = new ArrayList<>();

        int i = 0;

        while (i < nums1.length){
            int j = 0;
            while (j < nums2.length){
                if (nums1[i] == nums2[j] && !intersect.contains(nums1[i])){
                    intersect.add(nums1[i]);
                    break;
                }
                j++;
            }
            i++;
        }
        return intersect.stream()
                        .mapToInt(Integer::intValue).toArray();
    }

}
