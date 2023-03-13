package Hot100;

/**
 * @ClassName H55跳跃游戏
 * @Author 小镇做题家
 * @Function:
 */
public class H55跳跃游戏 {
    public boolean canJump(int[] nums) {
        int max=0;   //代表还能走的最远距离
        for (int i = 0; i < nums.length-1; i++) {
            --max;
            if(nums[i]>max){
                max=nums[i];
            }
            if(max==0){
                return false;
            }
        }
        return true;
    }
}
