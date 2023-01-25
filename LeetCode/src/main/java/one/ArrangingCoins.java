package main.java.one;

public class ArrangingCoins {

    public static void main(String[] args) {
        new ArrangingCoins().arrangeCoins(8);
    }

    public int arrangeCoins(int n){
        if (n == 0) return 0;
        if (n == 1) return 1;

        int lastNumber = 1;
        int numberOfRows = 0;

        while (n > 0){
            if (n == lastNumber) return ++numberOfRows;
            if (n < lastNumber) return numberOfRows;
            n -= lastNumber;
            lastNumber++;
            numberOfRows++;
        }

        return numberOfRows;
    }

}
