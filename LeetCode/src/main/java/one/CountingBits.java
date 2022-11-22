package one;

public class CountingBits {

    public int[] countBits(int n){
        if (n == 0) return new int[]{0};
        if (n == 1) return new int[]{0, 1};

        int[] array = new int[n + 1];

        for (int i = 0; i <= n; i++){
            String binary = Integer.toBinaryString(i);
            int ones = 0;
            for (int j = 0; j < binary.length(); j++)
            {
                if (binary.charAt(j) == '1') ones++;
            }
            array[i] = ones;
        }

        return array;
    }

}
