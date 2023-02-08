package main.java.one;

public class HammingDistance {

    public int hammingDistance(int x, int y){
        int i = 0;

        while (x > 0 || y > 0){
            int tempX = x & 1;
            int tempY = y & 1;
            if (tempX != tempY) i++;
            x >>= 1;
            y >>= 1;
        }

        return i;
    }

}
