package Hot100;

/**
 * @ClassName H42����ˮ
 * @Author С�������
 * @Function:
 */
public class H42����ˮ {
    public int trap(int[] height) {
        int left;
        int right;
        int result=0;
        int num;   //��¼�ڵ�i��ǽ��ռ�����֮��
        for(int i=1;i<=100000;++i){  //i�����i��
            num=0;
            left=0;
            right=height.length-1;
            while(height[left]<i && left<right)
                ++left;
            while(height[right]<i && left<right)
                --right;
            if(right-left<=1)
                return result;
            else{
                for(int j=left+1;j<right;++j){
                    if(height[j]>=i)
                        ++num;
                }
                result=result+(right-left-1-num);

            }


        }


        return result;
    }
}
