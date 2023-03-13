package Hot100;

/**
 * @ClassName H32最长有效括号
 * @Author 小镇做题家
 * @Function:
 */
public class H32最长有效括号 {
    public int longestValidParentheses(String s) {
        int max=0;
        int[] result=new int[s.length()];
        for (int i = 0; i < result.length; i++) {
            result[i]=0;
        }

        for(int i=1;i<s.length();++i){
            if(s.charAt(i)=='('){
                result[i]=0;
            }else{
                if(s.charAt(i-1)=='('){
                    result[i]=2;
                    if(max<result[i]){
                        max=result[i];
                    }
                    if(i-2>=0){
                        result[i]=result[i-2]+2;
                        if(max<result[i]){
                            max=result[i];
                        }
                    }
                }else{
                    if(result[i-1]==0){
                        result[i]=0;
                    }else{
                        if(i-result[i-1]-1>=0){
                            if(s.charAt(i-result[i-1]-1)=='('){
                                result[i]=result[i-1]+2;
                                if(max<result[i]){
                                    max=result[i];
                                }
                                if(i-result[i-1]-2>=0){
                                    result[i]=result[i-1]+2+result[i-result[i-1]-2];
                                    if(max<result[i]){
                                        max=result[i];
                                    }
                                }
                            }else{
                                result[i]=0;
                            }
                        }
                    }
                }



                }
            }


        return max;
        }


    }


