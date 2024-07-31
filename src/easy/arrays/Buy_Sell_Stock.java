package easy.arrays;

public class Buy_Sell_Stock {

    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};

        //base check
        if (prices.length <1){
            System.out.println("not valid");
        }

        int profit = 0;
        int buy = prices[0];

        for(int i = 1; i < prices.length; i++){
            if(prices[i] > buy){
                profit += prices[i] - buy;
            }
            buy = prices[i];
        }
        System.out.println(profit);
    }
}
