//Minimum Depth Binary Tree//
class Solution {
    public int minDepth(TreeNode root) {
        if(root==null){
            return 0;
        }
        if(root.left==null)
        {
            return minDepth(root.right)+1;
        }
        if(root.right==null){
            return minDepth(root.left)+1;
        }
        return Math.min(minDepth(root.right),minDepth(root.left))+1;
    }
}



//Maximum Depth Binary Tree//
class Solution {
    public int maxDepth(TreeNode root) {
        if(root==null){
            return 0;
        }
        return Math.max(maxDepth(root.left),maxDepth(root.right))+1;
    }
}