class Solution {
    public void flatten(TreeNode root) {
        if(root == null || (root.right == null && root.left == null)) {
            return;
        } 
        /* Flatten the left subtree first, making every right child of each node point to the next node and the left child point to null */
        if(root.left != null) {
            flatten(root.left);
            TreeNode temp = root.right;
            root.right = root.left;
            root.left = null;
            
            TreeNode curr = root.right;
            while(curr.right != null) {
                curr = curr.right;
            }
            curr.right = temp;
        }
        /* Once the left subtree is flattened, flatten the right subtree */
        flatten(root.right);
    }
}
