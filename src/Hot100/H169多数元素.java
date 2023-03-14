package Hot100;

/**
 * @Description:用摩尔投票法思路解决
 * @Author 小镇做题家
 * @create 2023/3/13 12:07
 */
public class H169多数元素 {
    public int majorityElement(int[] nums) {
        int ballot=nums[0];
        int count=1;
        for (int i = 1; i < nums.length; i++) {
            if(nums[i]==ballot){
                ++count;
            }else{
                --count;
                if(count==0){
                    ballot=nums[i];
                    count=1;
                }
            }
        }
        return ballot;
    }
}
