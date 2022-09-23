package one;

import java.util.*;

public class HappyNumber {

    public static void main(String[] args) {
        new HappyNumber().isHappy(3);
    }

    public boolean isHappy(int n){
        if(n == 0) return false;

        int              curr       = 0;
        HashSet<Integer> seenValues = new HashSet<>();

        do{
            int lD = n % 10;
            n /= 10;
            curr += lD * lD;
            if(n == 0){
                if (curr == 1) return true;
                if (!seenValues.add(curr)) return false;
                n = curr;
                curr = 0;
            }
        } while (n > 0);

        return false;
    }

}
