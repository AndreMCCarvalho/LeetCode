package one;

import java.util.*;

public class IntersectionOfTwoArraysTwo {

    public static void main(String[] args)
    {
        new IntersectionOfTwoArraysTwo().intersect(new int[]{1,2,2,1}, new int[]{2,2});
    }

    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);


        int i = 0, j = 0;

        List<Integer> intersect = new ArrayList<>();

        while(i < nums1.length && j < nums2.length){
            if (nums1[i] == nums2[j]){
                intersect.add(nums1[i]);
                i++;
                j++;
            }
            else if (nums1[i] < nums2[j]){
                i++;
            }
            else if (nums1[i] > nums2[j]){
                j++;
            }
        }
        return intersect.stream().mapToInt(Integer::intValue).toArray();
    }

}
