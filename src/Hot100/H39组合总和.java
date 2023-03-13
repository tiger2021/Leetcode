package Hot100;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

/**
 * @ClassName H39组合总和
 * @Author 小镇做题家
 * @Function:
 */
public class H39组合总和 {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result=new ArrayList<>();
        IntStream sorted = Arrays.stream(candidates).sorted();
        int[] nums = sorted.toArray();
        backtrace(result,nums,target,new ArrayList<>(),0);
        return result;
    }

    public void backtrace(List<List<Integer>> result,int[] candidates,int target,List<Integer> temp,int left){
        int sum=0;
        for (Integer num : temp) {
            sum=sum+num;
        }
        for (int i = left; i < candidates.length; i++) {
            int sum1=sum+candidates[i];
            if(sum1==target){
                temp.add(candidates[i]);
                List<Integer> r=new ArrayList<>();
                r.addAll(temp);
                result.add(r);
                temp.remove(temp.size()-1);
                return;
            }else if(sum1>target){
                return;
            }else{
                temp.add(candidates[i]);
                backtrace(result,candidates,target,temp,i);
                temp.remove(temp.size()-1);
            }
        }
    }
}
