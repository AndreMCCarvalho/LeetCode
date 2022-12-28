package one;

public class GuessNumberHigherOrLower
{
    public int guessNumber(int n) {
        int low = 0;
        int high = Integer.MAX_VALUE;
        int mid = ((high - low) / 2) + low;

        if (guess(high) == 0) return high;

        while (guess(mid) != 0){
            if (guess(mid) == -1){
                high = mid;
                mid = ((high - low) / 2) + low;
            }
            else {
                low = mid;
                mid = ((high - low) / 2) + low;
            }
        }
        return mid;
    }
}
