package main.java.one;

public class FirstBadVersion {

    public static void main(String[] args) {

    }

    public int firstBadVersion(int n){
        int i = 0;

        while (n - i > 1)
        {
            int mid = i + (n - i) / 2;
            if (isBadVersion(mid))
            {
                n = mid;
            }
            else {
                i = mid;
            }
        }
        return n;
    }

}
