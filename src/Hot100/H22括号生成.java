package Hot100;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName H22括号生成
 * @Author 小镇做题家
 * @Function:
 */
public class H22括号生成 {
    public List<String> generateParenthesis(int n) {
        int count=2*n;  //递归的最大深度
        int flag=0;  //在temp中最多还能放几个右括号
        int have=0; //在temp中已经存放了几个左括号
        List<String> result=new ArrayList<>();  //存放最终结果
        List<Character> temp=new ArrayList<>();
        backTrace(result,temp,count,have,flag,n);
        return result;
    }

    //定义回溯函数
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
