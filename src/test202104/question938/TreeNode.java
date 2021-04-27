package test202104.question938;

/**
 * class_name: TreeNode
 * package:
 * describe: 公共二叉树节点类
 * creat_user: haoxiaol
 * creat_date: 2021/4/27
 * creat_time: 上午10:23
 **/
public class TreeNode {

    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    static TreeNode createTreeNode(int[] arr) {
        TreeNode root = null;
        if (arr == null || arr.length < 1) {
            return root;
        }
        root = new TreeNode(arr[0]);
        for (int i = 1; i < arr.length; i++) {

            addNode(root, arr[i]);

        }
        return root;
    }

    private static void addNode(TreeNode node, int val) {
        if (node.val > val) {
            if (node.left == null) {
                node.left = new TreeNode(val);
            } else {
                addNode(node.left, val);
            }
        } else {
            if (node.right == null) {
                node.right = new TreeNode(val);
            } else {
                addNode(node.right, val);
            }
        }

    }

}
