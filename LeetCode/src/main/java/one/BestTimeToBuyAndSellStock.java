package one;

public class BestTimeToBuyAndSellStock {

    public static void main(String[] args) {

    }

    public int maxProfit(int[] prices){
        if (prices == null || prices.length == 0) return 0;

        int lowestPrice = Integer.MAX_VALUE;
        int maxProfit = Integer.MIN_VALUE;

        for(int i : prices){
            if (i < lowestPrice) lowestPrice = i;
            if (i - lowestPrice > maxProfit) maxProfit = i - lowestPrice;
        }

        return maxProfit;
    }

}
