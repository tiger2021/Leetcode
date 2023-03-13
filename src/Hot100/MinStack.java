package Hot100;

import java.util.Stack;

/**
 * @Description:֧�� push ��pop ��top �����������ڳ���ʱ���ڼ�������СԪ�ص�ջ����Ҫһ������ջ��������
 *              ��ǰջ��Ԫ�ص���Сֵ������ջ�к���ջ��Ԫ��Ҫ��֮ǰ��ջ��Ԫ��С
 * @Author С�������
 * @create 2023/3/13 10:30
 */
public class MinStack {
    private Stack<Integer> minStack;
    private Stack<Integer> stack;

    public MinStack() {
        minStack=new Stack<>();
        stack=new Stack<>();
        minStack.push(Integer.MAX_VALUE); //����Сջ����Ͷ˲���һ���ϴ����������Ͳ�Ӧ�ж�minStack�Ƿ�Ϊ��

    }

    public void push(int val) {
        stack.push(val);
        if(val<minStack.peek()){
            minStack.push(val);
        }else{
            minStack.push(minStack.peek()); //��һ����Ϊ�Ժ�Ԫ�س�ջ��׼����
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