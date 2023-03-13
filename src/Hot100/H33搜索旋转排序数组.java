package Hot100;

/**
 * @ClassName H33������ת��������
 * @Author С�������
 * @Function:
 */
public class H33������ת�������� {
    public int search(int[] nums, int target) {
        int left=0;
        int right=nums.length-1;
        while(left<right){
            int mid=(left+right)/2;
            if(nums[mid]==target){
                return mid;
            }
            if (nums[left] <=nums[mid] ) {
                if(target>nums[mid]){
                    left=mid+1;
                }else if(target>=nums[left]){
                    right=mid-1;
                }else{
                    left=mid+1;
                }
            } else{
                if(nums[left]<=target || target<nums[mid]){
                    right=mid-1;
                }else{
                    left=mid+1;
                }

            }


        }

        return nums[left]==target?left:-1;
    }
}
