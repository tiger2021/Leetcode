package Hot100;

import com.sun.org.apache.xpath.internal.operations.Minus;

/**
 * @ClassName H11盛最多水的容器
 * @Author 小镇做题家
 * @Function:
 */
public class H11盛最多水的容器 {
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
