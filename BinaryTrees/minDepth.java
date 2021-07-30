class Solution {
    /* Breadth-First-Search solution to the problem */
    public int minDepth(TreeNode root) {
        if(root == null) {
            return 0;
        }
        Queue<TreeNode> depthQueue = new LinkedList<>();
        depthQueue.add(root);
        int depth = 1;
        while(!depthQueue.isEmpty()) {
            int size = depthQueue.size();
            for(int i = 0; i < size; i++) {
                TreeNode curr = depthQueue.remove();
                if(curr.left == null && curr.right == null) {
                    return depth;
                }
                if(curr.left != null) {
                    depthQueue.add(curr.left);
                }
                if(curr.right != null) {
                    depthQueue.add(curr.right);
                }
            }
            depth++;
        }
        return depth;
    }
}
