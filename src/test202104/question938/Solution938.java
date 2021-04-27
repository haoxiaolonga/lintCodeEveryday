package test202104.question938;


/**
 * class_name: Solution938
 * package: test202104.question938
 * describe:  解答938  . 二叉搜索树的范围和
 * 给定二叉搜索树的根结点 root，返回值位于范围 [low, high] 之间的所有结点的值的和
 * 输入：root = [10,5,15,3,7,null,18], low = 7, high = 15
 * 输出：32
 * creat_user: haoxiaol
 * creat_date: 2021/4/27
 * creat_time: 上午10:27
 **/
public class Solution938 {

    public int rangeSumBST(TreeNode root, int low, int high) {
        int res = 0;
        if (root != null) {
            if (root.val >= low && root.val <= high) {
                res += root.val;
            }
            if(root.val > high){
                res += rangeSumBST(root.left, low, high);
            }
            if(root.val < low){
                res += rangeSumBST(root.right, low, high);
            }
        }
        return res;
    }

    public static void main(String[] args) {

        TreeNode node = TreeNode.createTreeNode(new int[]{10, 5, 15, 3, 7, 18});
        System.out.println(new Solution938().rangeSumBST(node, 7, 15));

    }

}
