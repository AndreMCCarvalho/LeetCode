package one;

public class PowerOfThree {

    public static void main(String[] args) {
    }

    public boolean isPowerOfThree(int n){
        while (n > 0)
        {
            if (n % 3 != 0) return false;
            n /= 3;
        }
        return true;
    }

}
