package Hot100;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName H22��������
 * @Author С�������
 * @Function:
 */
public class H22�������� {
    public List<String> generateParenthesis(int n) {
        int count=2*n;  //�ݹ��������
        int flag=0;  //��temp����໹�ܷż���������
        int have=0; //��temp���Ѿ�����˼���������
        List<String> result=new ArrayList<>();  //������ս��
        List<Character> temp=new ArrayList<>();
        backTrace(result,temp,count,have,flag,n);
        return result;
    }

    //������ݺ���
    public void backTrace(List<String> result,List<Character> temp,int count,int have,int flag,int n ){
        if(count==0){
            String r="";
            for (Character c : temp) {
                r=r+c;
            }

            result.add(r);
        } else if(have==n){
            temp.add(')');
            backTrace(result,temp,count-1,have,flag-1,n);
            temp.remove(temp.size()-1);
        }else if(flag==0){
            temp.add('(');
            backTrace(result,temp,count-1,have+1,flag+1,n);
            temp.remove(temp.size()-1);
        }else{
            temp.add('(');
            backTrace(result,temp,count-1,have+1,flag+1,n);
            temp.remove(temp.size()-1);
            temp.add(')');
            backTrace(result,temp,count-1,have,flag-1,n);
            temp.remove(temp.size()-1);
        }

    }
}
