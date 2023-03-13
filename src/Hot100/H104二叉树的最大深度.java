package Hot100;

/**
 * @Author 小镇做题家
 * @create 2023/3/10 10:20
 */
public class H104二叉树的最大深度 {
    public int maxDepth(TreeNode root) {
        int[] result=new int[]{0};
        int depth=0;
        dfs(root,depth,result);
        return result[0];
    }

    public void dfs(TreeNode root,int depth,int[] result){
        if(root==null){
            return;
        }else{
            ++depth;
            if(depth>result[0]){
                result[0]=depth;
            }
            dfs(root.left,depth,result);
            dfs(root.right,depth,result);
            --depth;
        }
    }
}
