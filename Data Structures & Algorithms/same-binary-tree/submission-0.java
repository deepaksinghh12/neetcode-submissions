class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {

        // Both nodes are empty
        if (p == null && q == null) {
            return true;
        }

        // Only one node is empty
        if (p == null || q == null) {
            return false;
        }

        // Values don't match
        if (p.val != q.val) {
            return false;
        }

        // Compare both subtrees
        return isSameTree(p.left, q.left)
            && isSameTree(p.right, q.right);
    }
}