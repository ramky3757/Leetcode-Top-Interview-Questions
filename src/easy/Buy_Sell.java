package easy.arrays;

public class Buy_Sell {
    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        int min = prices[0];
        int profit = 0;
        int max = 0;

        if(prices.length <2){
            return;
        }

        for(int i=1;i<prices.length;i++) {
            min = Math.min(prices[i], min);

            profit = prices[i]-min;
            max = Math.max(max, profit);
        }

        System.out.println(max);
    }
}
