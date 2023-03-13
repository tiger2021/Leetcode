package Hot100;

import java.util.Stack;

/**
 * @Description:支持 push ，pop ，top 操作，并能在常数时间内检索到最小元素的栈。需要一个辅助栈用来保存
 *              当前栈中元素的最小值，辅助栈中后入栈的元素要比之前入栈的元素小
 * @Author 小镇做题家
 * @create 2023/3/13 10:30
 */
public class MinStack {
    private Stack<Integer> minStack;
    private Stack<Integer> stack;

    public MinStack() {
        minStack=new Stack<>();
        stack=new Stack<>();
        minStack.push(Integer.MAX_VALUE); //在最小栈的最低端插入一个较大的数，后面就不应判断minStack是否为空

    }

    public void push(int val) {
        stack.push(val);
        if(val<minStack.peek()){
            minStack.push(val);
        }else{
            minStack.push(minStack.peek()); //这一部是为以后元素出栈做准备的
        }
    }

    public void pop() {
        minStack.pop();
        stack.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return minStack.peek();
    }
}