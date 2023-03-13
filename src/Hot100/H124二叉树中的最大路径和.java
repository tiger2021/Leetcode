package Hot100;

/**
 * @Author 小镇做题家
 * @create 2023/3/10 11:31
 * 二叉树 abc，a 是根结点（递归中的 root），bc 是左右子结点（代表其递归后的最优解）。
 * 最大的路径，可能的路径情况：
 *     a
 *    / \
 *   b   c
 * b + a + c。
 * b + a + a 的父结点。
 * a + c + a 的父结点。
 */
public class H124二叉树中的最大路径和 {
    public int maxPathSum(TreeNode root) {
        int[] val=new int[]{-1001};
        maxPathSum(root,val);
        return val[0];
    }

    public int maxPathSum(TreeNode root,int[] val){
        if(root==null){
            return 0;
        }else{
            int l=Math.max(0,maxPathSum(root.left,val));
            int r=Math.max(0,maxPathSum(root.right,val));
            int lmr=root.val+l+r;    //计算左中右的值
            int pmd=root.val+Math.max(l,r);
            val[0]=Math.max(val[0],Math.max(lmr,pmd));
            return pmd;
        }
    }
}
