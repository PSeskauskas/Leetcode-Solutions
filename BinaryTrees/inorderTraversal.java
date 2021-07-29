class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> inorderList = new ArrayList<>();
        if(root != null) {
            inorderSubtree(root, inorderList);
        }
        return inorderList;
    }
    public void inorderSubtree(TreeNode root, List<Integer> inorderList) {
        /* Iterate through the left subtree recursively */
        if(root.left != null) {
            inorderSubtree(root.left, inorderList);
        }
        /* Add each value to the arraylist */
        inorderList.add(root.val);
        /* Iterate through the right subtree recursively*/
        if(root.right != null) {
            inorderSubtree(root.right, inorderList);
        }
    }
}
