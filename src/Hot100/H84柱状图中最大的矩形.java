package Hot100;

/**
 * @ClassName H84柱状图中最大的矩形
 * @Author 小镇做题家
 * @Function:
 */
public class H84柱状图中最大的矩形 {
        public int largestRectangleArea(int[] heights) {
            int len=heights.length;
            len=len+1;
            int[] height=new int[len+1];
            height[0]=0;
            for(int i=0;i<len-1;++i){
                height[i+1]=heights[i];
            }
            ++len;
            height[len-1]=0;
            heights=height;
            int[] stack=new int[len];
            int top=0;
            stack[top]=0;
            int max=0;  //用来保存最大值
            for(int i=1;i<len;++i){
                if(heights[i]>=heights[stack[top]]){//比栈顶元素大或相等，,入栈下标
                    ++top;
                    stack[top]=i;
                }else{//比栈顶元素小，则出栈大的元素
                    while(heights[stack[top]]>heights[i]){
                        int left=stack[top];
                        while(heights[left-1]>=heights[stack[top]]){
                            left=left-1;
                        }
                        int square=(i-left)*heights[stack[top]];
                        --top;
                        if(square>max){
                            max=square;
                        }
                    }
                    ++top;
                    stack[top]=i;
                }
            }
            return max;
        }
}
