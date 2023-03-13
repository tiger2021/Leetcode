package Hot100;

import java.util.HashMap;
import java.util.Map;


/**
 * @ClassName H76最小覆盖子串
 * @Author 小镇做题家
 * @Function:
 */
public class H76最小覆盖子串 {
    public String minWindow(String s, String t) {
        if(s.length()<t.length()){
            return "";
        }
        Map<Character,Integer> need=new HashMap<>();
        int needSum=0;
        for (int i = 0; i < t.length(); i++) {
            ++needSum;
            Integer c = need.get(t.charAt(i));
            if(c==null){
                need.put(t.charAt(i),1);
            }else{
                ++c;
                need.replace(t.charAt(i),c);
            }
        }
        int left=0;
        int right=0;
        int minLength=100001;
        int leftFlag=0;
        while(right<s.length()){
            while(right<s.length() && needSum>0){
                char c = s.charAt(right);
                Integer count = need.get(c);
                if(count!=null){
                    if(count>0){
                        --needSum;
                    }
                    --count;
                    need.replace(c,count);
                }
                ++right;
            }
            if(needSum==0){
                while(needSum==0){
                    char c = s.charAt(left);
                    Integer count = need.get(c);
                    if(count!=null){
                        if(count==0){
                            ++needSum;
                        }
                        ++count;
                        need.replace(c,count);
                    }
                    ++left;
                    int length=right-(left-1);
                    if(length<minLength){
                        minLength=length;
                        leftFlag=left-1;
                    }
                }

            }

        }
        if(minLength==100001){
            return "";
        }else{
            return s.substring(leftFlag,leftFlag+minLength);
        }
    }
}
