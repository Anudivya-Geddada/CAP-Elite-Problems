class Solution {
    public TreeNode insertIntoBST(TreeNode root, int val) {
        TreeNode newnode = new TreeNode(val);
        if(root==null){
            root = newnode;
            return newnode;
        }
        TreeNode curr = root;
        TreeNode parent = null;
        while(curr!=null)
        {
            parent = curr;
            if(val<curr.val){
                curr = curr.left;
            }
            else{
                curr = curr.right;
            }
        }
        if(val < parent.val){
            parent.left = newnode;
        }
        else{
            parent.right = newnode;
        }
        return root;
    }
}