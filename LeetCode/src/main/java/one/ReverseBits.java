package one;

public class ReverseBits {

    public static void main(String[] args) {

    }

    public int reverseBits(int n){
        if (n == 0) return 0;

        int reverse = 0;

        for(int i = 0; i < 32; i++){
            reverse <<= 1;
            if ((n & 1) == 1) reverse++;
            n >>= 1;
        }

        return reverse;
    }

}
