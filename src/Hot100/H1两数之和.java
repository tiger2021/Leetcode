package Hot100;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName H1两数之和
 * @Author 小镇做题家
 * @Function:
 */
public class H1两数之和 {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map=new HashMap<>();
        Integer temp;
        int[] a=new int[]{-1,-1};
        for (int i = 0; i < nums.length; i++) {
            temp = map.get(target-nums[i]);
            if(temp!=null){
                a[0]=temp;
                a[1]=i;
            }else{
                map.put(nums[i],i);
            }
        }

        return a;

    }
}
