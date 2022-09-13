package one;

import java.util.*;

public class SingleNumber {

    public static void main(String[] args)
    {
        new SingleNumber().singleNumber(new int[]{2,2,1});
    }

    public int singleNumber(int[] nums){
        int ans =0;

        int len = nums.length;
        for(int i=0;i!=len;i++)
        {
            ans ^= nums[i];
            System.out.println(ans);
        }
        return ans;
    }
}
