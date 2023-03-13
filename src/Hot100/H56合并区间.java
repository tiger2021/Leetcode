package Hot100;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @ClassName H56合并区间
 * @Author 小镇做题家
 * @Function:
 */
public class H56合并区间 {
    public int[][] merge(int[][] intervals) {
        //先对interval是按照第一个元素进行排序
        for (int i = 0; i < intervals.length; i++) {
            for(int j=0;j<intervals.length-1-i;++j){
                if(intervals[j][0]>intervals[j+1][0]){
                    int temp0=intervals[j][0];
                    int temp1=intervals[j][1];
                    intervals[j][0]=intervals[j+1][0];
                    intervals[j][1]=intervals[j+1][1];
                    intervals[j+1][0]=temp0;
                    intervals[j+1][1]=temp1;
                }
            }
        }


        List<List<Integer>> result=new ArrayList<>();
        int left=intervals[0][0];
        int right=intervals[0][1];
        for (int i = 1; i < intervals.length; i++) {
            if(right<intervals[i][0]){
                List<Integer> temp=new ArrayList<>();
                temp.add(left);
                temp.add(right);
                result.add(temp);
                left=intervals[i][0];
                right=intervals[i][1];
            }else{
                if(intervals[i][1]>right){
                    right=intervals[i][1];
                }
            }
        }
        List<Integer> temp1=new ArrayList<>();
        temp1.add(left);
        temp1.add(right);
        result.add(temp1);

        int[][] r=new int[result.size()][2];
        int i=0;
        for (List<Integer> list : result) {
            r[i][0]=list.get(0);
            r[i][1]=list.get(1);
            ++i;
        }
        return r;
    }
}
