package dynammicprogramming;

/**
 * Created by Prasannakshi on 1/13/2018.
 */
public class buyandsell {
    public static int maxProfit(int[] prices, int fee) {
        int buy = Integer.MIN_VALUE, sell=0;
        for(int price: prices){
            int prev_sell = sell;
            int x = buy + price-fee;
            sell = Math.max(sell, x);
            buy = Math.max(buy, prev_sell-price);
        }
        return sell;
    }
    static int quicksolve(int[] prices){
        int total=0;
        for(int i=1;i<prices.length;i++){
            if(prices[i]>prices[i-1]){
                total += prices[i]-prices[i-1];
            }
        }
        return total;
    }
    public static void main(String args[]){
        int[] input = {1, 3, 2, 8, 4, 9};
        int resut = maxProfit(input, 2);
    }
}
