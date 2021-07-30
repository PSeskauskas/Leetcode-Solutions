class Solution {
    public boolean isSymmetric(TreeNode root) {
        return helperSymmetric(root.left, root.right);
    }
    public boolean helperSymmetric(TreeNode left, TreeNode right) {
        if(left == null && right != null || left != null && right == null) {
            return false;
        } else if(left == null && right == null) {
            return true;
        } else if(left.val != right.val) {
            return false;
        } else {
            return helperSymmetric(left.left, right.right) && helperSymmetric(left.right, right.left);
        }
    }
}
