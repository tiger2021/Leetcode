package Hot100;

/**
 * @ClassName H53最大子数组和
 * @Author 小镇做题家
 * @Function:
 */
public class H53最大子数组和 {
    public int maxSubArray(int[] nums) {
        int max=nums[0];
        int[] result =new int[nums.length];
        result[0]=max;
        for (int i = 1; i < nums.length; i++) {
            if(nums[i]+result[i-1]>nums[i]){
                result[i]=nums[i]+result[i-1];

            }else{
                result[i]=nums[i];
            }
            if(max<result[i]){
                max=result[i];
            }
        }
        return max;
    }
}
