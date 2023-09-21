//ORIGINAL ATTEMPT: 203/ 213 DUE TO TIME COMPLEIXTY

public class BestTimeToBuyAndSellStock {
    public int maxProfit(int[] prices) {

        int min = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < min) {
                min = prices[i]; // updating the smallest value possible
            }
            if (prices[i] - min > maxProfit) {
                maxProfit = prices[i] - min;
                // this logically works because we constantly update the minimum value &
                // maximizes profit

                // 1. let say our prices are [0 1 6 2 7]
                // Therefore, the algorithm will pick 0 as it is the smallest minimum value and
                // subtract it with 7 as it maximizes the difference

                // 2. let say our prices are [2 7 3 4 10]
                // Our first profit will be with (2,7). However, the algorithm will maximize it
                // by choosing (2,10)

                // 3. let say our prices are [2 7 1 4 10]
                // A new minimum value will be chosen (2,7) => (1,10)

                // 4. let say our prices are [2 7 3 1 3]
                // A new minimum value will be chosen 2 => 1 but the profit with (2,7) is still
                // the largest

            }
        }
        return maxProfit;
    }

}
