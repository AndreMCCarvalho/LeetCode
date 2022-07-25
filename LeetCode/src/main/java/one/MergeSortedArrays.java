package main.java.one;

public class MergeSortedArrays {

    public static void main(String[] args) {
        new MergeSortedArrays().merge(new int[]{2,0}, 1, new int[]{1}, 1);
    }

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1, j = n - 1, k = m + n - 1;
        while(k >= 0){
            if(m < 0) nums1[k--] = nums2[j--];
            else if(n < 0) nums1[k--] = nums1[i--];
            else{
                nums1[k--] = nums1[i] > nums2[j] ? nums1[i--] : nums2[j--];
            }
        }
    }
}
