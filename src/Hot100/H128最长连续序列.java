package Hot100;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description:给定一个未排序的整数数组 nums ，找出数字连续的最长序列（不要求序列元素在原数组中连续）的长度。
 * 请你设计并实现时间复杂度为O(n) 的算法解决此问题。
 * @Author 小镇做题家
 * @create 2023/3/11 11:26
 */
public class H128最长连续序列 {
    public int longestConsecutive(int[] nums) {
        Map<Integer,Integer> map=new HashMap<>();
        int max=0;
        for (int i = 0; i < nums.length; i++) {
            Integer num = map.get(nums[i]);
            if(num==null){
                map.put(nums[i],1);
                Integer numf=map.get(nums[i]-1);  //查看nums[i]的前一项是否存在
                if(numf!=null){
                    map.replace(nums[i],numf+1);
                }
                Integer numr=map.get(nums[i]+1);   //查看nums[i]的后一项是否存在
                if(numr!=null){
                    map.replace(nums[i],map.get(nums[i])+numr);
                    map.replace(nums[i]+1,map.get(nums[i]));
                }
                if(numf!=null){  //这一步比较关键
                    map.replace(nums[i]-1,map.get(nums[i]));
                }
                max=Math.max(max,map.get(nums[i]));
            }
        }
        return max;
    }
}
