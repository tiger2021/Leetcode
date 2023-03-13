package Hot100;

/**
 * @ClassName H31下一个排列
 * @Author 小镇做题家
 * @Function:
 */
public class H31下一个排列 {
    public void nextPermutation(int[] nums) {
        if(nums.length==1){
            return ;
        }else{
           for(int i=nums.length-2;i>=0;--i){
               int flag=0;
               int mini=101;
               int ni=-1;
               for(int j=nums.length-1;j>i;--j){
                   if(nums[j]>nums[i]){
                       flag=1;
                       if(nums[j]<mini){
                           mini=nums[j];
                           ni=j;
                       }
                   }
               }
               if(flag==1){
                   int temp=nums[i];
                   nums[i]=nums[ni];
                   nums[ni]=temp;
                   int length=nums.length-1;
                   for(int m=i+1;m<length;--length){
                       for(int h=m;h< length;++h){
                           if(nums[h]>nums[h+1]){
                               temp=nums[h];
                               nums[h]=nums[h+1];
                               nums[h+1]=temp;
                           }
                       }
                   }
                   return;
               }
           }
            for(int i=0,j=nums.length-1;i<j;++i,--j){
                int temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
            }
        }

    }
}
