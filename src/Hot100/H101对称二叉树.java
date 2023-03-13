package Hot100;

import sun.reflect.generics.tree.Tree;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author 小镇做题家
 * @create 2023/3/10
 */
public class H101对称二叉树 {


    public boolean isSymmetric(TreeNode root) {

        if(root==null){
            return true;
        }
        return dfs(root.left,root.right);
    }


    public boolean dfs(TreeNode left, TreeNode right){
        if(left==null && right==null){
            return true;
        }
        if(left==null || right==null){
            return false;
        }
        if(left.val!=right.val) {
            return false;
        }
        return dfs(left.left,right.right) && dfs(left.right,right.left);
    }
}
