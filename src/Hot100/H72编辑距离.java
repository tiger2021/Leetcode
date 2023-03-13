package Hot100;

/**
 * @ClassName H72编辑距离
 * @Author 小镇做题家
 * @Function:
 */
public class H72编辑距离 {
    public int minDistance(String word1, String word2) {
        int m=word1.length()+1;
        int n=word2.length()+1;
        int[][] result=new int[m][n];
        for (int i = 0; i < m; i++) {
            result[i][0]=i;
        }
        for (int i = 0; i < n; i++) {
            result[0][i]=i;
        }
        for(int i=1;i<n;++i){
            for(int j=1;j<m;++j){
                if(word1.charAt(j-1)==word2.charAt(i-1)){
                    result[j][i]=result[j-1][i-1];
                }else{
                    result[j][i]=1+Math.min(Math.min(result[j-1][i-1],result[j][i-1]),result[j-1][i]);
                }
            }
        }


        return result[m-1][n-1];
    }
}
