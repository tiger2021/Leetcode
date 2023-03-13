package Hot100;

import java.util.Arrays;

/**
 * @ClassName H75颜色分类
 * @Author 小镇做题家
 * @Function:
 */
public class H75颜色分类 {
    public void sortColors(int[] nums) {
        int left=0;
        int right=nums.length-1;
        int i=0;
        while(i<=right){
            if(nums[i]==0){
                int temp=nums[left];
                nums[left]=nums[i];
                nums[i]=temp;
                ++left;
                ++i;          //这儿为什么有++i呢？
            } else if (nums[i]==2) {
                int temp=nums[right];
                nums[right]=nums[i];
                nums[i]=temp;
                --right;      //这儿为什么没有++i呢？
            }else{
                ++i;
            }
        }
    }
}
