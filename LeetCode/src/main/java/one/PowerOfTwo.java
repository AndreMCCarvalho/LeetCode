package one;

public class PowerOfTwo {

    public static void main(String[] args) {

    }

    public boolean isPowerOfTwo(int n){
        while (n > 1){
            if (n % 2 != 0) return false;
            n /= 2;
        }
        return true;
    }

    public boolean thisIsCrazy(int n){
        return n > 0 && (n & n - 1) == 0;
    }
}
