package Hot100;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName H46全排列
 * @Author 小镇做题家
 * @Function:
 */
public class H46全排列 {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result=new ArrayList<>();
        int[] state=new int[nums.length];
        for (int i = 0; i < state.length; i++) {
            state[i]=0;
        }
        int index=0;
        backtrcae(nums,result,state,index,new ArrayList<>());

        return result;
    }
    public static void backtrcae(int[] nums,List<List<Integer>> result,int[] state,int index,List<Integer> temp){
        if(index==nums.length){
            List<Integer> r=new ArrayList<>();
            r.addAll(temp);
            result.add(r);
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if(state[i]==0){
                state[i]=1;
                temp.add(nums[i]);
                ++index;
                backtrcae(nums,result,state,index,temp);
                temp.remove(index-1);
                --index;
                state[i]=0;
            }
        }
    }
}
