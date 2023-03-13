package Hot100;

/**
 * @Author 小镇做题家
 * @create 2023/3/10 11:17
 */
public class H121买卖股票的最佳时机 {
    public int maxProfit(int[] prices) {
        int min=0;
        int max=0;
        int result=0;
        for (int i = 0; i < prices.length; i++) {
            if(prices[i]<prices[min]){
                max=i;
                min=i;
            }else if(prices[i]>prices[max]) {
                max=i;
                if(result<prices[max]-prices[min]){
                    result=prices[max]-prices[min];
                }
            }
        }
        return result;
    }
}
