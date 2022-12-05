package one;

public class PowerOfFour {

    public static void main(String[] args) {

    }

    public boolean isPowerOfFour(int n){
        if (n < 1) return false;

        while (n > 1){
            if (n % 4 != 0) return false;
            n /= 4;
        }

        return true;
    }

}
