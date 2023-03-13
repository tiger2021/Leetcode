package Hot100;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName H20有效括号
 * @Author 小镇做题家
 * @Function:
 */
public class H20有效括号 {
    // 给定一个只包括 '('，')'，'{'，'}'，'['，']'的字符串 s ，判断字符串是否有效。
    // 有效字符串需满足：
    // 左括号必须用相同类型的右括号闭合。
    // 左括号必须以正确的顺序闭合。
    // 每个右括号都有一个对应的相同类型的左括号。
    public boolean isValid(String s) {
        List<Character> stack=new ArrayList<>();
        int top=-1;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            switch (c){
                case '(':{
                    ++top;
                    stack.add(top,'(');
                    break;
                }
                case '[':{
                    ++top;
                    stack.add(top,'[');
                    break;
                }
                case '{':{
                    ++top;
                    stack.add(top,'{');
                    break;
                }
                case ')':{
                    if(top==-1){
                        return false;
                    }
                    Character temp = stack.get(top);
                    --top;
                    if(!temp.equals('(')){
                        return false;
                    }
                    break;
                }
                case ']':{
                    if(top==-1){
                        return false;
                    }
                    Character temp = stack.get(top);
                    --top;
                    if(!temp.equals('[')){
                        return false;
                    }
                    break;

                }
                case '}':{
                    if(top==-1){
                        return false;
                    }
                    Character temp = stack.get(top);
                    --top;
                    if(!temp.equals('{')){
                        return false;
                    }
                    break;
                }
            }
        }
        if(top==-1){
            return true;
        }else{
            return false;
        }
    }
}
