package Hot100;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName H3无重复字符的最长子串的长度
 * @Author 小镇做题家
 * @Function:
 */
public class H3无重复字符的最长子串的长度 {
    public int lengthOfLongestSubstring(String s) {
        char[] arr = s.toCharArray();
        int mark=0;
        int result=0;
        int length=0;
        Map<Character,Integer> map=new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            Integer m = map.get(arr[i]);
            if(m==null){
                map.put(arr[i],i);
                ++length;
                if(length>result){
                    result=length;
                }
            }
            else if(m<mark){
                map.replace(arr[i],i);
                ++length;
                if(length>result){
                    result=length;
                }
            }else{
                map.replace(arr[i],i);
                mark=m+1;
                length=i-mark+1;
            }
        }
        return result;

    }
}
