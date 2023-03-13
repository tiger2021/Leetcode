package Hot100;

/**
 * @ClassName H70爬楼梯
 * @Author 小镇做题家
 * @Function:
 */
public class H70爬楼梯 {
    public int climbStairs(int n) {
        int[] result=new int[n];
        if(n<=1){
            return 1;
        }else{

            result[0]=1;
            result[1]=2;
            for (int i = 2; i < result.length; i++) {
                result[i]=result[i-1]+result[i-2];
            }
        }
        return result[n-1];
    }
}
