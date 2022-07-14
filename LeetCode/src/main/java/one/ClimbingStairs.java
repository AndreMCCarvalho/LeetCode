package one;

public class ClimbingStairs
{

    public static void main(String[] args)
    {

    }

    public int climbStairs(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        if (n == 2) return 2;

        int one_step = 2;
        int two_step = 1;
        int all_ways = 0;

        for(int i = 2; i < n; i++){
            all_ways = one_step + two_step;
            two_step = one_step;
            one_step = all_ways;
        }

        return all_ways;
    }

    public int climbStair(int n) {
        int[] memory = new int[n + 1];
        memory[0] = 1;
        memory[1] = 1;

        for(int i = 2; i <= n; i++){
            memory[i] = memory[i - 1] + memory[i - 2];
        }

        return memory[n];
    }

}
