/*
 * iven the root of a binary tree, check whether it is a mirror of itself (i.e., symmetric around its center).
 */
public class less_2_3 {
    public static void main(String[] args) {

    }

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
    }

    public boolean isSymmetric(TreeNode root) {
        if (root == null)

            return true;

        return Helper(root.left, root.right);
    }

    boolean Helper(TreeNode left, TreeNode right) {

        if (left == null && right == null)

            return true;

        else if (left == null || right == null)

            return false;

        boolean cond1 = left.val == right.val;

        boolean cond2 = Helper(left.left, right.right);

        boolean cond3 = Helper(left.right, right.left);

        return cond1 && cond2 && cond3;

    }
}
