package Hot100;

/**
 * @ClassName H5最长回文子串
 * @Author 小镇做题家
 * @Function:
 */
public class H5最长回文子串 {
    public String longestPalindrome1(String s) {
        if(s.length()==0 || s.length()==1)
            return s;
        int start=0;
        int maxStart=0;
        int len=1;
        int maxlength=1;
        int left,right;
        for(int i=0;i<s.length();++i){
            left=i-1;
            right=i+1;
            while(left>=0 && s.charAt(left)==s.charAt(i))
                --left;
            while(right<s.length() && s.charAt(right)==s.charAt(i))
                ++right;
            while(left>=0 && right<s.length() && s.charAt(left)==s.charAt(right)){
                --left;
                ++right;
            }
            len=right-left-1;
            if(len>=maxlength){
                maxlength=len;
                maxStart=left+1;
            }
        }
        String substring = s.substring(maxStart, maxlength + maxStart);

        return substring;
    }
}
