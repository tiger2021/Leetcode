package Hot100;

/**
 * @ClassName H34�����������в���Ԫ�صĵ�һ�������һ��λ��
 * @Author С�������
 * @Function:
 */
public class H34�����������в���Ԫ�صĵ�һ�������һ��λ�� {
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
