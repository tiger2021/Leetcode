package Hot100;

import com.sun.org.apache.xpath.internal.operations.Minus;

/**
 * @ClassName H11ʢ���ˮ������
 * @Author С�������
 * @Function:
 */
public class H11ʢ���ˮ������ {
    public int maxArea(int[] height) {
        int max=0;
       int l=0;
       int r=height.length-1;
       while(l<r){
           int h=r-l;
           int w= height[l]<=height[r]?height[l]:height[r];
           if(height[l]<=height[r]){
               ++l;
           }else{
               --r;
           }
           int temp=h*w;
           if(temp>=max)
               max=temp;

       }

        return max;
    }
}
