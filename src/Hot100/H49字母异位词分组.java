package Hot100;

import java.util.*;

/**
 * @ClassName H49字母异位词分组
 * @Author 小镇做题家
 * @Function:
 */
public class H49字母异位词分组 {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result=new ArrayList<>();
        Map<String,List<String>> map=new HashMap<>();
        for (String str : strs) {
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);;
            List<String> list= map.get(key);
            if(list==null){
                list=new ArrayList<>();
                list.add(str);
                map.put(key,list);
            }else{
                list.add(str);
            }
        }
        Iterator<String> it = map.keySet().iterator();
        while(it.hasNext()){
            String key = it.next();
            List<String> list = map.get(key);
            result.add(list);
        }
        return result;
    }
}
