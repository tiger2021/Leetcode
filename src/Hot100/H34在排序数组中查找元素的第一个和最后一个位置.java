package Hot100;

/**
 * @ClassName H34在排序数组中查找元素的第一个和最后一个位置
 * @Author 小镇做题家
 * @Function:
 */
public class H34在排序数组中查找元素的第一个和最后一个位置 {
    public int[] searchRange(int[] nums, int target) {
        int left=search(nums,target,0);
        int right=search(nums,target,1);
        int[] result=new int[]{left,right};

        return result;
    }
    int search(int[] nums,int target,int flag){
        int left=0;
        int right=nums.length-1;
        int result=-1;
        while(left<=right){
            int mid=(left+right)/2;
            if(nums[mid]==target){
                result=mid;
                if(flag==0){
                    right=mid-1;
                }else{
                    left=mid+1;
                }
            }else if(nums[mid]<target){
                left=mid+1;
            }else{
                right=mid-1;
            }
        }

        return result;
    }
}
