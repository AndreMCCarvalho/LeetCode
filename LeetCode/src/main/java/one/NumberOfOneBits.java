package one;

public class NumberOfOneBits {

    public static void main(String[] args) {

    }

    public int hammingWeight(int n){
        if (n == 0) return 0;

        int counter = 0;

        for (int i = 0; i < 32; i++){
            if((n & 1) == 1) counter++;
            n >>= 1;
        }

        return counter;
    }

}
