package Hot100;

/**
 * @Author 小镇做题家
 * @create 2023/3/10 10:48
 */
public class H114二叉树展为链表 {
    /**
     * @description: 不断将根节点的右子树插入到根节点的左子树的最右端，然后将根节点的左子树调整到根节点的右子树上
     * @param: [root]
     * @return: void
     **/
    public void flatten(TreeNode root) {
        TreeNode p=root;
        while(p!=null){
            if(p.left!=null){
                TreeNode r=p.left;
                while(r.right!=null){    //寻找左子树最右端的节点
                    r=r.right;
                }
                r.right=p.right; //将根节点的右子树添加到根节点的左子树的最右端
                p.right=p.left;   //将根节点的左子树添加到根节点的右子树的位置
                p.left=null;
            }
            p=p.right;
        }
    }

}
