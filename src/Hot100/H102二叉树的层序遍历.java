package Hot100;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author 小镇做题家
 * @create 2023/3/10 9:45
 */
public class H102二叉树的层序遍历 {
   /**
    * @description: 这儿用到了队列的思想
    * @param: [root]
    * @return: java.util.List<java.util.List<java.lang.Integer>>
    **/
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result=new ArrayList<>();
        if(root==null){
            return null;
        }else{
            List<TreeNode> que=new ArrayList<>();
            int count=1;    //记录每一层有几个结点
            int left=-1;    //队头指针
            int right=0;    //队尾指针
            que.add(root);  //根节点入队
            while(left!=right){  //队列中的节点出队
                int length=count;
                count=0;
                List<Integer> temp=new ArrayList<>();//用来每一层的节点中的数值
                while(length!=0){
                    --length;
                    ++left;
                    TreeNode node = que.get(left);
                    if(node.left!=null){
                        ++right;
                        ++count;
                        que.add(node.left);
                    }
                    if(node.right!=null){
                        ++right;
                        ++count;
                        que.add(node.right);
                    }
                    temp.add(node.val);
                }
                result.add(temp);
            }
            return result;
        }

    }

}
