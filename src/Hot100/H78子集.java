package Hot100;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName H78子集
 * @Author 小镇做题家
 * @Function:
 */
public class H78子集 {

    /*
    * 用二進制的某一位i的0和1代表nums[i]是否添加
    * */
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result=new ArrayList<>();
        for(int i=0;i<(1<<nums.length);++i){
            List<Integer> temp=new ArrayList<>();
            for(int j=0;j<nums.length;++j){
                if(((i>>j)&1)==1){
                    temp.add(nums[j]);
                }
            }
            result.add(temp);
        }
        return result;
    }
}
