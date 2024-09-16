class Solution {
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0; 
        }

        
        int leftDepth = maxDepth(root.left);
        int rightDepth = maxDepth(root.right);

        // the maximum depth of the left and right subtrees, plus 1 (for the root)
        return Math.max(leftDepth, rightDepth) + 1;
    }
}
