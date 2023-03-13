package Hot100;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @ClassName H17电话号码的数字组合
 * @Author 小镇做题家
 * @Function:
 */
public class H17电话号码的数字组合 {
    public List<String> letterCombinations(String digits) {
        List<String> result=new ArrayList<>();
        Map<Character,String> phoneMap=new HashMap<>();
        phoneMap.put('2',"abc");
        phoneMap.put('3',"def");
        phoneMap.put('4',"ghi");
        phoneMap.put('5',"jkl");
        phoneMap.put('6',"mno");
        phoneMap.put('7',"pqrs");
        phoneMap.put('8',"tuv");
        phoneMap.put('9',"wxyz");

        backtrack(result,digits,0,phoneMap,new StringBuilder());


        return null;
    }

    public void backtrack(List<String> result,String digits,int index,Map<Character,String> phoneMap,StringBuilder combination){
        if(index==digits.length()){
            result.add(combination.toString());
        }else{
            char digit = digits.charAt(index);
            String letters = phoneMap.get(digit);
            for(int i=0;i<letters.length();++i){
                combination.append(letters.charAt(i));
                backtrack(result,digits,index+1,phoneMap,combination);
                combination.deleteCharAt(index);
            }

        }

    }

}
