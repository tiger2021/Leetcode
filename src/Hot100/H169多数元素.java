package Hot100;

/**
 * @Description:��Ħ��ͶƱ��˼·���
 * @Author С�������
 * @create 2023/3/13 12:07
 */
public class H169����Ԫ�� {
    public int majorityElement(int[] nums) {
        int ballot=nums[0];
        int count=1;
        for (int i = 1; i < nums.length; i++) {
            if(nums[i]==ballot){
                ++count;
            }else{
                --count;
                if(count==0){
                    ballot=nums[i];
                    count=1;
                }
            }
        }
        return ballot;
    }
}
