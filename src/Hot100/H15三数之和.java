package Hot100;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName H15三数之和
 * @Author 小镇做题家
 * @Function:
 */
public class H15三数之和 {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result=new ArrayList<>();
        //先对数组进行快速排序
        quickSort(nums,0,nums.length-1);

        int sum;
        for (int i = 0; i < nums.length-1; i++) {
            if(nums[i]>0) break;  //开始元素大于零，直接返回结果
            if(i>0 && nums[i]==nums[i-1]) continue;  //去重

            int med=i+1,right=nums.length-1;
            while(med<right){
                sum=nums[i]+nums[med]+nums[right];
                if(sum==0){
                    List<Integer> list=new ArrayList<>();
                    list.add(nums[i]);
                    list.add(nums[med]);
                    list.add(nums[right]);
                    result.add(list);
                    while(med<right && nums[med]==nums[med+1]){
                        ++med;
                    }
                    ++med;
                    while(med<right && nums[right]==nums[right-1]){
                        --right;
                    }
                    --right;
                } else if (sum < 0) {
                    ++med;
                }else{
                    --right;
                }

            }
        }

        return result;
    }

    public void quickSort(int[] nums,int left,int right){
        if(left>=right)
            return;
        int market=nums[left];
        int l=left,r=right;
        while(l<r){
            while(l<r && nums[r]>market){
                --r;
            }
            if(l<r){
                nums[l]=nums[r];
                ++l;
            }
            while(l<r && nums[l]<=market){
                ++l;
            }
            if(l<r){
               nums[r]=nums[l];
               --r;
            }
        }
        nums[l]=market;
        if(left<l){
            quickSort(nums,left,--l);
        }
        if(right>l){
            quickSort(nums,++l,right);
        }
    }


}
