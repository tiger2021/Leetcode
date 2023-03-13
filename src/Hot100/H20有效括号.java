package Hot100;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName H20��Ч����
 * @Author С�������
 * @Function:
 */
public class H20��Ч���� {
    // ����һ��ֻ���� '('��')'��'{'��'}'��'['��']'���ַ��� s ���ж��ַ����Ƿ���Ч��
    // ��Ч�ַ��������㣺
    // �����ű�������ͬ���͵������űպϡ�
    // �����ű�������ȷ��˳��պϡ�
    // ÿ�������Ŷ���һ����Ӧ����ͬ���͵������š�
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
