class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> preorder = new ArrayList<>();
        if(root != null) {
            preorderSubtree(root, preorder);
        }
        return preorder;
    }
    public void preorderSubtree(TreeNode root, List<Integer> preorder) {
        /* Add the value once it is visited */
        preorder.add(root.val);
        /* Iterate through both subtrees recursively */
        if(root.left != null) {
            preorderSubtree(root.left, preorder);
        }
        if(root.right != null) {
            preorderSubtree(root.right, preorder);
        }
    }
}
