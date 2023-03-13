package Hot100;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName H94二叉树的中序遍历
 * @Author 小镇做题家
 * @Function:
 */
public class H94二叉树的中序遍历 {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<Integer>();
        dfs(res,root);
        return res;
    }

    void dfs(List<Integer> res, TreeNode root) {
        if(root==null) {
            return;
        }
        //按照 左-打印-右的方式遍历
        dfs(res,root.left);
        res.add(root.val);
        dfs(res,root.right);
    }

}
