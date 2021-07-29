class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> postorder = new ArrayList<>();
        if(root != null) {
            postorderSubtree(root, postorder);
        }
        return postorder;
    }
    public void postorderSubtree(TreeNode root, List<Integer> postorder) {
        if(root.left != null) {
            postorderSubtree(root.left, postorder);
        }
        if(root.right != null) {
            postorderSubtree(root.right, postorder);
        }
        postorder.add(root.val);
    }
}
